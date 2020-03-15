package Practice;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String a="java";
		String b ="ajav";
		char[] c =a.toCharArray();
		char[] d = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		System.out.println(Arrays.equals(c, d));
		
	}

}
