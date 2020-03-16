package demo.junit_class_demo.grades;

import demo.junit_class_demo.grades.HistogramGenerator;
import demo.junit_class_demo.grades.ChartIO;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.jfree.chart.JFreeChart;

public class HistogramGeneratorTes {
	int[] list={3,8,1,2,8,3,4,7,2,1,8,3,9,7,5,2};

	@Mock
	public ChartIO ins;

	@InjectMocks
	public HistogramGenerator his;

	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}


	@Test
	public void test_generate_normal() {
		String s1=""; String s2=""; JFreeChart c=null;
		Mockito.when(ins.readFile(s1)).thenReturn(new int[]{1,2,3,4,5,6,7,8,9});
		his.generateHistogram(s1,s2);
	}
	@Test
	/*public void test1() {
		int[] a=new int[10];
		Mockito.when(his.calculateFrequencies(a)).thenReturn(new int[]{1,2,3,4,5,6,7,8,9});

		assertTrue(his.createChart(his.calculateFrequencies(a)) instanceof JFreeChart);
	}*/
	public void test2() {

	}
	public void test3() {

	}
	
}
