package demo.junit_class_demo.grades;


import demo.junit_class_demo.grades.HistogramGenerator;
import demo.junit_class_demo.grades.ChartIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class HistogramMain {

	public static void main(String[] args) {
		
		HistogramGenerator hg = new HistogramGenerator(new ChartIO());
		hg.generateHistogram("unit_test_demo/src/main/resources/grades.txt", "histogram.jpeg");

		/*Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s);*/

		System.out.println("Program terminated");

	}

}
