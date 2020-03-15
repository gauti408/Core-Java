package Practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class DeleteArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int index=2;
		int[] b = new int[a.length-1];
		int k =0;
		for(int i=0;i<a.length-1;i++) {
			if(i==index) {
				continue;
			}
			b[k++]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
	}

}
