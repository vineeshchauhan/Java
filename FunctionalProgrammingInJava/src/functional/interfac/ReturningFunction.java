package functional.interfac;

public class ReturningFunction {

	public static void main(String[] args) {
		INoArgFunction<INoArgFunction<String>> myFunction = () -> () -> "Hello Functional!";

		INoArgFunction<String> func = myFunction.apply();

		System.out.println(func.apply());

	}

}
