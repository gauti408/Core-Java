package MathFunction;

public class absDistinctValue {

	public static void main(String[] args) {
		int[] a = {1,2,6,7,1,2};
		int count =0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}System.out.println(count+" "+(a.length-count));

	}

}
