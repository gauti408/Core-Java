package Practice;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num =0;
		for(int r=a;r>=1;r--) {
			for(int c=r;c>=1;c--) {
				System.out.print(num+" ");
				num++;
			}System.out.println();
		}
	}

}
