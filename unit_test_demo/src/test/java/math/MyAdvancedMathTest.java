package demo.junit_class_demo.math;
import demo.junit_class_demo.grades.HistogramGenerator;
import demo.junit_class_demo.grades.ChartIO;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import demo.junit_class_demo.math.MyAdvancedMath;
import demo.junit_class_demo.math.MyMath;

import static org.mockito.Mockito.*;

/**
 * An class that provides test cases for the 
 * "advanced" math operations of the MyAdvancedMath 
 * class, for demonstrating Unit Testing.
 */
public class MyAdvancedMathTest {
	/* 
	 * A reference to the MyAdvancedMath class
	 * whose methods we are testing in this class
	 */
	MyAdvancedMath mam =new MyAdvancedMath();
	
	/*
	 * This is a constructor which is called 
	 * when the MyAdvancedMathTest
	 */
	public MyAdvancedMathTest() {
		
	}
	@Test
	public void toplama1(){
		Assert.assertEquals(10,mam.add(2,8));
	}

	@Test (expected = IllegalArgumentException.class)
	public void integersinirasma() {
		int i1=2000000000; int i2=1000000000;
		mam.add(i1,i2);
	}
	@Test (expected = IllegalArgumentException.class)
	public void negativevalues2() {
		mam.add(-3,1);
	}
	@Test (expected = IllegalArgumentException.class)
	public void negativevalues() {
		mam.add(1,-2);
	}
	@Test
	public void geneltest(){
		Assert.assertEquals(32,mam.powerOfTwo(5));
	}
	@Test
	public void sıfırkuvvet(){
		Assert.assertEquals(1,mam.powerOfTwo(0));
	}
	@Test (expected = IllegalArgumentException.class)
	public void sinir1() {
		mam.powerOfTwo(44);
	}
	@Test (expected = IllegalArgumentException.class)
	public void sinir2() {
		mam.powerOfTwo(-2);
	}
	

	/*
	 * A test case for the exceptions caused when
	 * the result of the addition doesn't fit 
	 * in an Integer variable.
	 */
	//@Test (expected = IllegalArgumentException.class)
	//public void testAdd_shouldThrowException_overflow() {
	//
	//}
	
	/*
	 * A test case for the exceptions caused when
	 * one or more input values are negative. Testing
	 * the exception is performed with a @Rule
	 */
	//@Rule 
	//public ExpectedException thrown = ExpectedException.none(); //initialize it to .none()
	//@Test 
	//public void testAdd_shouldThrowException_negativeInput() {
	//
	//	
	//}
		
	/*
	 *  The following method aims to test the reverseArray 
	 *  of the MyAdvancedMath class. However, its execution 
	 *  depends on the MyMath's reverseNumber method and a fail 
	 *  in this method can cause this test to fail too. Thus, the 
	 *  test is not isolated and cannot be called a valid Unit Test.
	 *  The test_reverseArray_Mocking() is the atomic and 
	 *  isolated unit test for the reverseArray method.
	 */
	@Test
	public void test_reverseArray() {
		MyMath op=new MyMath();
		Assert.assertArrayEquals(new int[]{-3,-2,-1,3,2,1},mam.reverseArray(new int[]{3,2,1,-3,-2,-1},op));
	}
	
	/*
	 * The following test aims to fix the problem described in 
	 * the previous test_reverseArray test case. In order to 
	 * isolate the external (to this class) dependencies (MyMath)
	 * we have to mock them and predefine the results of
	 * all calls that we plan to execute on the MyMaths' methods.
	 */
	@Test
	public void test_reverseArray_Mocking() {
		MyMath op=mock(MyMath.class);
		when(op.reverseNumber(1)).thenReturn(-1);  when(op.reverseNumber(2)).thenReturn(-2);
		when(op.reverseNumber(3)).thenReturn(-3);  when(op.reverseNumber(4)).thenReturn(-4);
		when(op.reverseNumber(5)).thenReturn(-5);  when(op.reverseNumber(6)).thenReturn(-6);

		int[] arr={1,2,3,4,5,6};
		Assert.assertArrayEquals(new int[]{-1,-2,-3,-4,-5,-6},new MyAdvancedMath().reverseArray(arr,op));
	}
}
