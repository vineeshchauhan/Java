package functional.interfac;

import java.util.function.Function;

public class FunctionDemo {

	protected class MyMath {
		public static Integer triple(Integer x) {
			return x * 3;
		}

	}

	public static void main(String[] args) {

		MyMath.triple(3);

		// Function interface works with only one argument.
		// treating other class method as object
		Function<Integer, Integer> myTriple = MyMath::triple;
		Integer result = myTriple.apply(3);

		System.out.println(result);

		// Using Lambda Expression
		Function<Integer, Integer> myTripleLambda = x -> x * 3;
		result = myTripleLambda.apply(3);
		
		System.out.println(result);

	}

}
