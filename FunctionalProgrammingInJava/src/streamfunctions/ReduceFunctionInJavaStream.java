package streamfunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceFunctionInJavaStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		BinaryOperator<Integer> getSum = (x,y) -> x+y;
		
		System.out.println(list.stream().reduce(getSum).get());
		
	}
}
