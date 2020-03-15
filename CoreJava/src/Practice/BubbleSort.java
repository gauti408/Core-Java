package Practice;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] a = {9,8,7,5,6};
		for(int b : a) {
			System.out.println(b);
			
		}
		bubbleSort(a);

	}
	private static void bubbleSort(Integer[] c) {
		Integer[] d = new Integer[c.length];
		for(int i=0;i<c.length;i++) {
			
			for(int j= i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					d[i]=c[i];
					c[i]=c[j];
					c[j]=d[i];
				}
			}
			
		}
		for(int b : c) {
			System.out.print(b+" ");
			
		}
		
	}

}
