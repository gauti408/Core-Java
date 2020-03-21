package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class properties {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(4);
		list.add(1);
		list.stream().sorted().forEach(element -> System.out.println(element));
		System.out.println();
		list.stream().distinct().sorted().forEach(element -> System.out.println(element));
		System.out.println();
		list.stream().distinct().map(element -> element*element).forEach(element -> System.out.println(element));
	}

}
