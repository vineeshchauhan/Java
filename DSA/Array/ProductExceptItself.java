
public class ProductExceptItself {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 3, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		int[] resultArr = productAllExceptItself(arr);
		System.out.println();
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + ",");
		}

	}

	private static int[] productAllExceptItself(int[] arr) {

		int[] resultArr = new int[arr.length];
		int product = 1;

		// product of all right
		for (int i = 0; i < arr.length; i++) {
			resultArr[i] = product;
			product = product * arr[i];
		}
		product = 1;

		// product of all left
		for (int i = arr.length - 1; i >= 0; i--) {
			resultArr[i] = product * resultArr[i];
			product = product * arr[i];

		}
		return resultArr;
	}

}
//Complexity is O(n)
