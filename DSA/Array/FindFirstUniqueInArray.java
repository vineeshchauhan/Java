
public class FindFirstUniqueInArray {

	public static int findFirstUnique(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			result = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				return result;
			}

		}
		return result;
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

		int[] arr = { 2, 54, 7, 2, 6, 54, 6, 8, 7 };

		System.out.println("Array: " + arrayToString(arr));

		int unique = findFirstUnique(arr);
		System.out.print("First Unique in an Array: " + unique);

	}
}

//complexity is O(n^2)