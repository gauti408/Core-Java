package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test2 {

	public static void main(String[] args) {
		String s = "java";
		displayDuplicate(s);
		
	}
	private static void displayDuplicate(String a) {
		Map<Character,Integer> map = new HashMap<>();
		
		char[] b =a.toCharArray();
		for(char c : b) {
			
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		for(Map.Entry<Character,Integer> display : map.entrySet()) {
			System.out.println(display.getKey()+" "+display.getValue());
		}
		
		
		
		
	}

}
