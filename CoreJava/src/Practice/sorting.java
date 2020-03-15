package Practice;

import java.util.Arrays;
import java.util.Collections;

public class sorting {

	public static void main(String[] args) {
		String[] a = {"Gautam","Rohit","Tabbu","Bewra","Anguri"};
		
		Arrays.sort(a);
		for(String b : a) {
			System.out.println(b);
		}
		System.out.println("************************");
		Arrays.sort(a,Collections.reverseOrder());
		for(String b : a) {
			System.out.println(b);
		}

	}

}
