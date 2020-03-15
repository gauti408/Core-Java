package DataType;

import java.util.Scanner;

public class digitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		String b= String.valueOf(a);
		char[] c = b.toCharArray();
		int d= 0;
		
		for(int i=0;i<c.length;i++) {
			d =d+ Integer.parseInt(String.valueOf(c[i]));
			
		}
		System.out.println(d);

	}

}
