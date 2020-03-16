package Conditional;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		sc.close();
		
		String Day="";
		switch(a){
		
		case 1 : Day="sunday"; break;
		case 2 : Day="Monday"; break;
		case 3 : Day="Tuesday"; break;
		case 4 : Day="Wednusday"; break;
		case 5 : Day="Thusday"; break;
		case 6 : Day="Friday"; break;
		case 7 : Day="Saturday"; break;
		default : Day="Invalid input"; break;
			
		}System.out.println(Day);

	}

}
