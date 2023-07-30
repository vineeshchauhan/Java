package streamfunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterFunctionInJavaStream {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		Predicate<Integer> isEven = x -> (x%2 == 0) ? true : false;
		
		list.stream().filter(isEven).forEach(System.out::println);
		
		
		List<String> listStr = Arrays.asList("Hello", "functional", "programming","is","cool");
		
		Predicate<String> isLongerThan5 = (str) -> str.length() > 5;
		
		Function<Integer, Predicate<String>> func = (x) -> (str) -> str.length() > x;
		
		listStr.stream().filter(func.apply(5)).forEach(System.out::println);
		
		
	}

}
