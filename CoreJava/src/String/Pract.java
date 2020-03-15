package String;

import java.util.Arrays;

public class Pract {

	public static void main(String[] args) {
		String a = "Gautam is great";
		String b = "Rohit is";
		String c =a.concat(b);
		System.out.println(c);
		System.out.println(a.contains(c));
		
		StringBuffer str = new StringBuffer(a);
		System.out.println(a.contentEquals(a));
		
		char[] e = {'1','2','3','4'};
		String f = String.copyValueOf(e, 1, 3);
		System.out.println(f);

	}

}
