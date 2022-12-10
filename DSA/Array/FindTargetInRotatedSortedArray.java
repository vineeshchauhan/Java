import java.util.Arrays;

public class FindTargetInRotatedSortedArray {

	  public static void main(String[] args) {
	        int[] targetList = {3, 6, 3, 6};
	        int[][] numsList = {{6, 7, 1, 2, 3, 4, 5}, {6, 7, 1, 2, 3, 4, 5}, {4, 5, 6, 1, 2, 3},
	                {4, 5, 6, 1, 2, 3}};

	        for (int i = 0; i < targetList.length; i++) {
	            System.out.println((i + 1) + ". Rotated array: " + Arrays.toString(numsList[i]));
	            System.out.println("   target " + targetList[i] + " found at index "
	                    + binarySearchRotated(numsList[i], targetList[i]));
	            System.out.println(
	                    "----------------------------------------------------------------------------------------------------\n");
	        }
	    }

	private static int binarySearchRotated(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int middle = start + (end - start) / 2;

		while (arr[middle] != target) {
			if(arr[middle] > arr[start]) {
				if(target >= arr[start] && target < arr[middle]) {
					end = middle -1;
				}else {
					start = middle+1;// no use of mine even if shorted
				}
			}else {
				if(target > arr[middle] && target <= arr[end]) {
					start = middle+1;
				}else {
					end = middle-1;// no use of mine even if shorted
				}
			}
			middle = start + (end - start) / 2;
		}
		return middle;
	}

}
