package functional.interfac;

public class TriFunctionJava {

	public static void main(String[] args) {
		ITriFunction<Integer, Integer, Integer, Integer> myFunction = (x, y, z) -> (x + y + z);
		
		System.out.println(myFunction.apply(1, 2, 3));
		
	}

}

