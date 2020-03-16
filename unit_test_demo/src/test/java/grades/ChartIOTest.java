package demo.junit_class_demo.grades;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
import demo.junit_class_demo.grades.ChartIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ChartIOTest {

	ChartIO io = new ChartIO();
	@Test
	public void test_readFile_happyPath() {
		String path="/home/kadir/Desktop/hw2-kadirarslann-master/BIL481_HW2/project/unit_test_demo/src/test/resources/grades_normal.csv";
		Object o=new ChartIO().readFile(path);
		Assert.assertFalse(o==null);

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_readFile_SadPath() {
		String path="nonse_string_of_path";
		new ChartIO().readFile(path);
	}

	@Test (expected = NumberFormatException.class)
	public void test_readFile_SadPath2() {
		String path="/home/kadir/Desktop/hw2-kadirarslann-master/BIL481_HW2/project/unit_test_demo/src/test/resources/grades_invalid.csv";
		new ChartIO().readFile(path);
	}
	@Test (expected = NullPointerException.class)
	public void test_writeFile_SadPath() {
		String path=null;
		new ChartIO().readFile(path);
	}

	
	
}
