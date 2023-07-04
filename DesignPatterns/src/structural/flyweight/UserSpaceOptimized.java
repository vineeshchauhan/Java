package structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * saves names using index.
 *
 */
public class UserSpaceOptimized {

	static List<String> listOfString = new ArrayList<>();
	
	public int [] names;

	public UserSpaceOptimized(String fullName) {
		Function<String, Integer> getOrAdd = (String string) -> {
			int index = listOfString.indexOf(string);
			if (index != -1)
				return index;
			listOfString.add(string);
			return listOfString.indexOf(string);

		};
		names = Arrays.stream(fullName.split(" ")).mapToInt(s -> getOrAdd.apply(s)).toArray();
	}

	public String getName(int [] names) {
		return listOfString.get(names[0]) +" "+ listOfString.get(names[1]);
	}
	
	
}
