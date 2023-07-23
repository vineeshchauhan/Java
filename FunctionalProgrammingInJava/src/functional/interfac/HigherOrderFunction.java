package functional.interfac;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunction {
	public static void main(String[] args) {

		BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

		Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> safeDivide = 
				(function1) -> (x, y) -> {
					if (y == 0f) {
						System.out.println("Divide by 0f is not allowed");
						return 0f; // returning float
					}
					return function1.apply(x, y); // returning float
				};

		BiFunction<Float, Float, Float> f = safeDivide.apply(divide);
		System.out.println("Test");
		System.out.println(f.apply(40f, 0f));

	}

}
