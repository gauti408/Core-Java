package DataType;

import java.util.Scanner;

public class DateTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long timeZone =sc.nextLong();
		sc.close();
		long milisec= System.currentTimeMillis();
		long totalSec = milisec/1000;
		long currentSec = totalSec%60;
		long totalMin = totalSec/60;
		long currentMin = totalMin%60;
		long totalhr = totalMin /60;
		long currentHr= totalhr%60;
		System.out.println(currentHr+ ":"+currentMin+":"+currentSec);

	}

}
