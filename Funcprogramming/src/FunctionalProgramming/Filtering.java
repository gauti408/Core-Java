package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class Filtering {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Rohan");
		list.add("Raman");
		filterNm(list);
		System.out.println();
		filterWithFp(list);
		
	}
	public static void filterNm(List<String> name) {
		for(String names: name) {
			if(names.endsWith("an")) {
				System.out.println(names);
			}
		}
	}
	public static void filterWithFp(List<String> name) {
		name.stream().filter(element ->element.endsWith("an")).forEach(element -> System.out.println(element));
	}

}
