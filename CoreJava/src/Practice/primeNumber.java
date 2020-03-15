package Practice;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();
		Boolean p = false;
		for(double i=2;i<a;i++) {
			
			if(a/i!=1) {
				p=true;
			}
		}if(p=true) {
		System.out.println("Number is prime");
		}
	}

}
