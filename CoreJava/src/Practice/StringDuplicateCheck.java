package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class StringDuplicateCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(duplicateCheck(a));
		

	}
	public static String duplicateCheck(String b) {
		StringBuffer sf = new StringBuffer();
		Set<Character> set = new HashSet<>();
		for(int i = 0;i<b.length();i++) {
			char c = b.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
			
		}
		
		return sf.toString();
	}

}
