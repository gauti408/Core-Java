package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class exc2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(4);
		list.stream().filter(element -> (element % 2 !=0)).forEach(element -> System.out.println(element));
		list.stream().filter(element -> (element %2 ==0)).forEach(element -> System.out.println(element));
	}

}
