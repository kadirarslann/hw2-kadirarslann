package demo.junit_class_demo.grades;

import demo.junit_class_demo.grades.HistogramGenerator;
import demo.junit_class_demo.grades.ChartIO;


import org.jfree.chart.ChartFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.jfree.chart.JFreeChart;

public class HistogramGeneratorTest {

	@Test
	public void test_generate_normal() {

	}
	@Test
	public void test1() {
	HistogramGenerator his=new HistogramGenerator(new ChartIO());
		int[] a={1,1,1,1,1,1,1,1,1,1,1};
		Assert.assertArrayEquals(a,his.calculateFrequencies(new int[]{0,1,2,3,4,5,6,7,8,9,10}));
	}
	@Test
	public void test2() {
		HistogramGenerator his=new HistogramGenerator(new ChartIO());
		Assert.assertTrue(his.createChart(new int[]{1,2,3,4,5,6,7}) !=null);
	}


}
