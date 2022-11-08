
public class FindSecondMax {

	public static int findSecondMaximum(int[] arr) {

		int firstMax = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secMax = firstMax;
				firstMax = arr[i];
			} else if (arr[i] > secMax && arr[i] != firstMax) {
				secMax = arr[i];
			}
		}
		return secMax;
	}

	public static String arrayToString(int arr[]) {
		if (arr.length > 0) {
			String result = "";
			for (int i = 0; i < arr.length; i++) {
				result += arr[i] + " ";
			}
			return result;
		} else {
			return "Empty Array!";
		}
	}

	public static void main(String args[]) {

		int[] arr = { -2, -33, -2, -10, -456 };

		System.out.println("Array: " + arrayToString(arr));

		int secMax = findSecondMaximum(arr);

		System.out.println("Second maximum: " + secMax);

	}
}
//Complexity is O(n)