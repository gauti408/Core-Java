package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(1);
		list.add(6);
		Collections.swap(list, 0, 2);
		System.out.println(list);
	}

}
