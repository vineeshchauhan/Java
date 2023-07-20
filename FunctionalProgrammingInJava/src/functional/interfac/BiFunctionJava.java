package functional.interfac;

import java.util.function.BiFunction;

public class BiFunctionJava {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> myFunction = (x, y) -> x + y;

		System.out.println(myFunction.apply(10, 20));
	}
}
