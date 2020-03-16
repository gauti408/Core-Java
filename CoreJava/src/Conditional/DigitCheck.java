package Conditional;

import java.util.Arrays;

public class DigitCheck {

	public static void main(String[] args) {
		int a =3256;
		String b= String.valueOf(a);
		char[] c = b.toCharArray();
		Arrays.sort(c);
		String d =String.valueOf(c);
		System.out.println(Integer.parseInt(d));

	}

}
