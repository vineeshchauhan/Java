
public class RemoveEvenInteger {

	public static int[] removeEven(int[] arr) {
		// find length of new array
		int evenlength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				evenlength++;
			}
		}
		int[] oddArray = new int[evenlength];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddArray[j] = arr[i];
				j++;
			}
		}
		return oddArray;
	}

	public static void main(String args[]) {

		int size = 10;
		int[] arr = new int[size]; // declaration and instantiation

		System.out.print("Before removing Even Numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i; // assigning values
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] newArr = removeEven(arr); // calling removeEven

		System.out.print("After removing Even Numbers: ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " "); // prinitng array
		}
	}
}

//Complexity of the solution is O(2n). Since we ignore the constants, complexity of 
//above solution is O(n)