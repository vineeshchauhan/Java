public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int element = binarySearch(nums, 0);
		System.out.println(element);

	}

	static int binarySearch(int[] nums, int target) {
		// int middleElement = nums.length/2;
		if (nums.length == 0) {
			return -1;
		}
		int startIndex = 0;
		int endIndex = nums.length - 1;
		int middleElement = (endIndex + startIndex) / 2;
		while (nums[middleElement] != target) {
			if (endIndex == startIndex) {
				return -1;
			}
			if (nums[middleElement] < target) {
				startIndex = middleElement + 1;
			} else {
				endIndex = middleElement - 1;
			}
			middleElement = (endIndex + startIndex) / 2;
		}
		return middleElement;

	}
}