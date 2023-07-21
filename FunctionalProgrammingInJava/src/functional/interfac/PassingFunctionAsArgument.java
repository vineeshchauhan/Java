package functional.interfac;

import java.util.function.BiFunction;

public class PassingFunctionAsArgument {

	protected static class MyMath {

		public static Integer add(int x, int y) {
			return x + y;
		}

		public static Integer subtract(int x, int y) {
			return x - y;
		}

		public static Integer execute(BiFunction<Integer, Integer, Integer> myFunction, int x, int y) {
			return myFunction.apply(x, y);
		}
	}

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> myFunctionAdd = MyMath::add;
		System.out.println(MyMath.execute(myFunctionAdd, 4, 2));
		
		BiFunction<Integer, Integer, Integer> myFunctionSub = MyMath::subtract;
		System.out.println(MyMath.execute(myFunctionSub, 4, 2));
		
		
		System.out.println(MyMath.execute((x,y) -> x*y, 4, 2));
		
		
	}

}
