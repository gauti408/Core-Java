package Practice;

import java.util.Scanner;

public class Patern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1;i<=100;i++) {
			
			if(a%i==0) {
				System.out.print("factorial of "+a+" is "+i);
			}
			
			
		}
		
	}

}
