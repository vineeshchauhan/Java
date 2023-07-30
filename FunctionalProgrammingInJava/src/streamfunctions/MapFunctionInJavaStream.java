package streamfunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class MapFunctionInJavaStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println(list.stream().map(i -> i * 2).collect(Collectors.toList()));

		Function<Integer, Integer> doubleFunction = x -> (x * 2);

		System.out.println(list.stream().map(doubleFunction).collect(Collectors.toList()));

		List<String> list2 = Arrays.asList("Geeks", "for", "gfg", "GeeksforGeeks", "GeeksQuiz");

		ToIntFunction<String> doubleFunction1 = x -> (x.length());

		list2.stream().mapToInt(doubleFunction1).forEach(System.out::println);

		List<String> listOfAsianCountries = Arrays.asList("India", "Pakistan", "Nepal", "Bangladesh", "Sri Lanka");
		List<String> listOfAfricanCountries = Arrays.asList("South Africa", "Morocco", "Ghana", "Nigeria","Ivery Coast");

		List<List<String>> listOfCountries = Arrays.asList(listOfAsianCountries, listOfAfricanCountries);

		System.out.println(listOfCountries.stream().flatMap(c -> c.stream()).anyMatch(c -> c.equals("Nepal")));

		System.out.println(listOfCountries.stream().flatMap(c -> c.stream()).anyMatch(c -> c.equals("America")));

	}

}
