package Practice;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 1;
		sc.close();
		for(int r=1;r<=a;r++) {
			
			for(int c=1;c<=r;c++) {
				System.out.print(num+" ");
				num++;	
			}
			System.out.println(" ");
		}
	}

}
