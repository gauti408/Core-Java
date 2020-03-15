package DataType;

import java.util.Scanner;

public class Speed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hr = sc.nextDouble();
		double min = sc.nextDouble();
		double sec = sc.nextDouble();
		double dis= sc.nextDouble();
		Double Speed =  (dis/(hr*60*60+min*60+sec));
		System.out.println(Speed);
		System.out.println(Math.pow(Speed, 4));

	}

}
