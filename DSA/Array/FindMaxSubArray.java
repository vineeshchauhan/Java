import java.util.Arrays;

public class FindMaxSubArray {
	public static int findMaxSumSubArray(int[] arr) {
		int currMax = arr[0];
		int globalMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (currMax < 0) {
				currMax = arr[i];
			} else
				currMax += arr[i];
			if (currMax > globalMax) {
				globalMax = currMax;
			}

		}
		return globalMax;
	}

	public static void main(String args[]) {
		int[] arr1 = { 1, 7, -2, 9, -7, -9, 11, 30 };
		System.out.println("Array: " + Arrays.toString(arr1));
		System.out.println("Sum: " + findMaxSumSubArray(arr1));
	}
}