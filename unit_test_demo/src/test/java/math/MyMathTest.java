package demo.junit_class_demo.math;

import org.junit.Test;

import demo.junit_class_demo.math.MyMath;

import org.junit.Assert;

/**
 * An class that provides test cases for the 
 * "simple" math operations of the MyMath 
 * class, for demonstrating Unit Testing.
 * @author agkortzis (antonis.gkortzis@gmail.com)
 */
public class MyMathTest {
	MyMath mm = new MyMath();

    @Test
    public void testGetSignShouldReturnPositive() {
    	    Assert.assertEquals("positive",mm.checkSign(1));
    }

    @Test
    public void testGetSignShouldReturnNegative() {
        Assert.assertEquals("negative",mm.checkSign(-1));
    }

    @Test (expected = IllegalArgumentException.class)
    public void exceptionkontrolmymath (){
        mm.checkSign(0);
    }

    @Test
    public void reversetest(){
        Assert.assertEquals(-1, mm.reverseNumber(1));
    }

    
    
}



