package Practice;

public class largestAndSmallest {

	public static void main(String[] args) {
		int[] a=new int[]{1,100,20,30,50};
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int b : a) {
			if(b>largest) {
				 largest=b;
			}
		}
		System.out.println(largest);
		for(int b : a) {
			if(b<smallest) {
				smallest=b;
			}
		}System.out.println(smallest);

	}

}
