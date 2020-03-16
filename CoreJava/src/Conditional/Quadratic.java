package Conditional;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		double d = b*b-4*a*c;
		if(d>0) {
			double x = (-b+Math.pow(d,0.5))/(2*a);
			double y = (-b-Math.pow(d,0.5))/(2*a);
			System.out.println(x+" and " +y);
		}else {
			System.out.println("no real roots are possible");
		}

	}

}
