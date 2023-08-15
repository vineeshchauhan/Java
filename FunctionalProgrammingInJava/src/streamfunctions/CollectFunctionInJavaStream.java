package streamfunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectFunctionInJavaStream {
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hello","Apply", "functional", "programming", "is", "cool");

		Predicate<String> isLongerThan5 = (str) -> str.length() > 5;

		Function<Integer, Predicate<String>> func = (x) -> isLongerThan5;

		System.out.println(listStr.stream().filter(func.apply(5)).collect(Collectors.joining(", ")));
		
		System.out.println(listStr.stream().filter(func.apply(5)).collect(Collectors.counting()));
		
		System.out.println(listStr.stream().collect(Collectors.groupingBy( (word) -> word.length())));
		
		System.out.println(listStr.stream().collect(Collectors.partitioningBy( (word) -> word.length()>5)));
		
	}
}
