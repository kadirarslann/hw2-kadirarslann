package demo.junit_class_demo.grades;
import org.jfree.chart.JFreeChart;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
import demo.junit_class_demo.grades.ChartIO;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ChartIOTest {

	ChartIO io = new ChartIO();

	@Test
	public void test_readFile_happyPath() {
		String path="src/test/resources/grades_normal.csv";
		Object o=new ChartIO().readFile(path);
		Assert.assertFalse(o==null);
	}
	@Test
	public void test_readFile_happyPath2() {
		String path="src/test/resources/grades_normal.csv";
		int[] arr={15,10,0};
		Assert.assertArrayEquals(arr,new ChartIO().readFile(path));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_readFile_SadPath() {
		String path="nonse_string_of_path";
		new ChartIO().readFile(path);
	}

	@Test (expected = NumberFormatException.class)
	public void test_readFile_SadPath2() {
		String path="src/test/resources/grades_invalid.csv";
		new ChartIO().readFile(path);
	}
	@Test (expected = Exception.class)
	public void test_writefile(){
		new ChartIO().writeFile("nonsensepath",null);
	}



	
	
}
