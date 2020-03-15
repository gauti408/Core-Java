package Practice;

public class factorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println(fact(0));

	}
	public static int fact(int b) {
		int a=1;
		if(b>1) {
		a=a*b*fact(b-1);
		return a;
		}else {
			return a;
		}
	}

}
