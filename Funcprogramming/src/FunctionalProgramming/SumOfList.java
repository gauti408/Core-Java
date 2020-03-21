package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(4);
		
		int sum = list.stream().reduce(0,(list1,list2) -> (list1+list2));
		System.out.println(sum);
		
		int sum2 =0;
		for(Integer no : list) {
			sum2 += no;
		}
		System.out.println(sum2);
		int sumOdd =list.stream().filter(element -> (element %2 !=0)).reduce(0,(element1,element2) -> (element1+element2));
		System.out.println(sumOdd);

	}
	

}
