package demo.junit_class_demo.math;


public class MyMath 
{

	public String checkSign(int number) {
		if ( number > 0 ) {
			return "positive";
		} else if ( number < 0 ) {
			return "negative";
		} else {
			throw new IllegalArgumentException("Number had no sign");
		}
	}
	

	public int reverseNumber(int number) {
		return -number;
	}
	
}

