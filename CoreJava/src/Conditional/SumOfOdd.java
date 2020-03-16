package Conditional;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				sum = sum + i;

			}

		}
		System.out.println(sum);

	}

}
