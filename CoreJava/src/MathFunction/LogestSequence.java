package MathFunction;

public class LogestSequence {

	public static void main(String[] args) {
		
		System.out.println(countSequence(0011110111));
		

	}public static int countSequence(int number) {
		int count=0;
		while(number !=0) {
			number=(number & (number << 1));
			count++;
		}
		
		return count;
	}

}
