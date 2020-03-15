package Practice;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitString {

	public static void main(String[] args) {

		String s ="091-254879";
		String[] str=s.split("-");
		System.out.println("by split method");
		for(String print : str) {
			System.out.println(print);
		}
		
		
		System.out.println("Spliting String by pattern class");
		List<String> strings=Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());
		for(String print: strings) {
			System.out.println(print);
		}
		
		System.out.println("Tokenizer");
		StringTokenizer str2 = new StringTokenizer(s,"-");
		while(str2.hasMoreTokens()) {
			String s2=str2.nextToken();
			System.out.println(s2);
		}
		
		System.out.println("String Utills");
		//String splitArray[] = StringUtils.split(s,"-");
		
		System.out.println("Guava Jar");
		//Iterable<String> results =Splitter.on("-").split(s);

	}

}
