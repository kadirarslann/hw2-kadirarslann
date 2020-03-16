package demo.junit_class_demo.math;
import  demo.junit_class_demo.math.MyMathTest;
import demo.junit_class_demo.math.MyAdvancedMathTest;
import demo.junit_class_demo.math.MyAdvancedMathTest_PowerOfTwo_ParameterizedTest;
import demo.junit_class_demo.math.MyAdvancedMathTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * An class with a main method for executing the defined 
 * classes that include tests and presenting the results, 
 * for demonstrating Unit Testing.
	 * @author agkortzis (antonis.gkortzis@gmail.com)
 */
public class TestRunner {

	public static void main(String[] args) {
		/*
		 * The JUnitCore can execute a set of
		 * classes that include tests by calling 
		 * the static runClasses method with the 
		 * test classes as arguments. The results 
		 * are stored in a Result object that can 
		 * be parsed.
		 */
		Result result = JUnitCore.runClasses(
				MyMathTest.class);
		Result result1 = JUnitCore.runClasses(
				MyAdvancedMathTest.class);
		Result result2 = JUnitCore.runClasses(
				MyAdvancedMathTest_PowerOfTwo_ParameterizedTest.class);

		
		// Retrieving and printing any failed tests
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.getMessage());
		}
		for (Failure failure : result1.getFailures()) {
			System.out.println(failure.getMessage());
		}
		for (Failure failure : result2.getFailures()) {
			System.out.println(failure.getMessage());
		}
		
		// Printing a success message (only if the execution was successful
		System.out.println("Tests completed successfully :: " 
		+ result.wasSuccessful());
	}

}
