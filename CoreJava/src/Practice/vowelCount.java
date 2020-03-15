package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class vowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		sc.close();
		char[] c = s.toCharArray();
		int num =0;
		
		for(char a: c) {
			
			
			switch(a){
			case('a'):
			case('e'):
			case ('i'):
			case('o'):
				num++;
			}
			
		}
		System.out.println(num);

	}

}
