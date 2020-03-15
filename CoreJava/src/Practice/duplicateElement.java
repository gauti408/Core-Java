package Practice;

import java.util.HashSet;
import java.util.Set;

public class duplicateElement {

	public static void main(String[] args) {
		String[] s = new String[] { "java", "Gautam", "Rohit", "Rajiv","Gautam" };
		Set nonDuplicateSet = new HashSet<>();
		Set DuplicateSet = new HashSet<>();

		for (String a : s) {
			if (!nonDuplicateSet.contains(a)) {
				nonDuplicateSet.add(a);

			}else {
				DuplicateSet.add(a);
			}
			

		}System.out.println(DuplicateSet);
	}

}
