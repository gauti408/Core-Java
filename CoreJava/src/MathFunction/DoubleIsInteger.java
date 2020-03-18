package MathFunction;

public class DoubleIsInteger {

	public static void main(String[] args) {
		double a = 15.256;
		double b = a%1;
		if(a==b) {
			System.out.println("integer");
		}else {
			System.out.println("not integer");
		}

	}

}
