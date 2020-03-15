package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortingInMap {

	public static void main(String[] args) {
		Map<String, String> unsortedMap = new HashMap<>();
		unsortedMap.put("Rohit", "Rohit");
		unsortedMap.put("Neha", "Neha");
		unsortedMap.put("Gautam", "Gautam");
		for(Map.Entry<String, String> map: unsortedMap.entrySet()) {
			System.out.println(map.getValue());
		}System.out.println("********************");
		
		Map<String ,String> tree = new TreeMap<>(unsortedMap);
		for(Map.Entry<String, String> treeMap : tree.entrySet()) {
			System.out.println(treeMap.getKey());
		}

	}

}
