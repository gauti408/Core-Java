package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class exc3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ant");
		list.add("Bat");
		IntStream.range(1,11).map(element -> element*element).forEach(element -> System.out.println(element));
		list.stream().map(element -> element.toLowerCase()).forEach(element -> System.out.println(element));
		list.stream().map(element -> element.length()).forEach(element -> System.out.println(element));
		

	}

}
