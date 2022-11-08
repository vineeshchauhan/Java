
public class MergeSortedArray {

	public static void main(String args[]) {

		int[] arr1 = { 1, 12, 14, 17, 56 }; // creating a sorted array called arr1
		int[] arr2 = { 11, 19, 23, 27 }; // creating a sorted array called arr2

		int[] resultantArray = mergeArrays(arr1, arr2); // calling mergeArrays

		System.out.print("Arrays after merging: ");
		for (int i = 0; i < arr1.length + arr2.length; i++) {
			System.out.print(resultantArray[i] + " ");
		}
	}

	private static int[] mergeArrays(int[] arr1, int[] arr2) {
		int length1 = arr1.length;
		int length2 = arr2.length;
		int sortedArrLength = 0;
		int[] sortedArray = new int[length1 + length2];

		int i = 0, j = 0;
		while (i < length1 && j < length2) {
			if (arr1[i] < arr2[j]) {
				sortedArray[sortedArrLength++] = arr1[i++];
			} else
				sortedArray[sortedArrLength++] = arr2[j++];
		}

		while (i < length1) {
			sortedArray[sortedArrLength++] = arr1[i++];
		}
		while (j < length2) {
			sortedArray[sortedArrLength++] = arr2[j++];
		}
		return sortedArray;
	}

}

//Complexity would O(n+m).
