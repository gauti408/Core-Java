package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalVal {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(4);
		int num =IntStream.range(1,11).reduce(0,(element1,element2) -> (element1+element2));
		System.out.println(num);
		
		Integer max=list.stream().max((n1,n2) ->Integer.compare(n1,n2)).get();
		System.out.println(max);
		
		Integer min = list.stream().min((n1,n2) -> Integer.compare(n1,n2)).get();
		System.out.println(min);
		
		list.stream().filter(element -> (element%2!=0)).forEach(element -> System.out.println(element));
		
		List odd =list.stream().filter(element -> (element%2!=0)).collect(Collectors.toList());
		System.out.println(odd);
		
		List  even =list.stream().filter(element -> (element%2==0)).collect(Collectors.toList());
		System.out.println(even);
		
		List<Integer> num2 = IntStream.range(1,11).map(element -> (element*element)).boxed().collect(Collectors.toList());
		
		System.out.println(num2);
		
		
		
	}

}
