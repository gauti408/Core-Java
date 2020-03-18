package MathFunction;

import java.util.HashSet;

public class absDistinctValue2 {

	public static void main(String[] args) {
		int[] a = {1,2,5,4,1,2,5};
		HashSet<Integer> set = new HashSet<Integer>();
		int count =0;
		for(int i=0;i<a.length;i++) {
			if (!set.contains(a[i])) {
				set.add(a[i]); 
				count++;
			}
		}System.out.println(count);

	}

}
