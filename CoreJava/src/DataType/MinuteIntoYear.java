package DataType;

import java.util.Scanner;

public class MinuteIntoYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float minute = sc.nextFloat();
		sc.close();
		float day = minute/(60*24);
		float year = day/365;
		System.out.println(day +"   "+year);

	}

}
