package Practice;

public class PrintNumberWithoutUsingLoop {

	public static void main(String[] args) {
		printNumber(1);

	}
	private static void printNumber(int a) {
		
		if(a<=10) {
			System.out.println(a);
			printNumber(a+1);
		}
	}

}
