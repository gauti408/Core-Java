package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class exc {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.stream().forEach(element -> System.out.println(element));

	}

}
