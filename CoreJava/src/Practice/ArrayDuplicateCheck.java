package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateCheck {

	public static void main(String[] args) {
		Integer[] a= new Integer[]{1,2,6,1,5};
		List duplicateList = Arrays.asList(a);
		System.out.println(duplicateList);
		Set duplicateSet = new HashSet<>(duplicateList);
		System.out.println(duplicateSet);
		if(duplicateList.size()!=duplicateSet.size()) {
			System.out.println("duplicate value");
		}else {
			System.out.println("distinct value");
		}

	}

}
