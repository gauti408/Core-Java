package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class FuncProgRunning {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Rohan");
		list.add("Raman");
		printWithFP(list);

	}
	public static void printWithNm(List<String> list) {
		for(String string : list) {
			System.out.println(string);
		}
	}
	
	public static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

}
