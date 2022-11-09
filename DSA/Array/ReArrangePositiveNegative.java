
public class ReArrangePositiveNegative {

	public static void reArrange(int[] arr) {
		int i = 0;
		int j = arr.length - 1;

		while (j > i) {
			if (arr[i] < 0) {
				i++;
			}
			if (arr[j] >= 0) {
				j--;
			}
			if (j > i )
				swap(arr, i, j);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String args[]) {

		int[] arr = { 2, 4, -6, 8, -5, -10 };
		//int[] arr = {10, -1, 20, 4, 5, -9, -6};

		System.out.print("Array before re-arranging: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		reArrange(arr);

		System.out.print("Array after rearranging: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}