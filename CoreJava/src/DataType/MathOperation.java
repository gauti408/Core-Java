package DataType;

import java.util.Scanner;

public class MathOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b= sc.nextInt();
		int sum= a+b;
		int dif= a-b;
		int mul = a*b;
		int div= a/b;
		int max= Math.max(a, b);
		int min =Math.min(a, b);
		int avg = (a+b)/2;
		System.out.println(a+" "+b +" "+sum+" "+dif+" "+mul+" "+div+" "+max+" "+min);

	}

}
