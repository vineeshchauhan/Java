
public class RotateArrayOneToRight {

	public static void rotateArray(int[] arr) {

		//rotate right
		/*int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				temp = arr[i];
				arr[i] = arr[arr.length - 1];
			} else {
				int local = arr[i];
				arr[i] = temp;
				temp = local;
			}
		}*/
		int temp = arr[arr.length-1];
		for (int i = arr.length-1; i >0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		System.out.println("Rigth Rotate : " + arrayToString(arr));
		//rotate left
		temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;

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

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Initial Array: " + arrayToString(arr));

		rotateArray(arr);

		System.out.println("Final Array:   " + arrayToString(arr));

	}
}
