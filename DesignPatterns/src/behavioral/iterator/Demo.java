package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		Iterator<String> it = new ListIterator<String>(list);

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
