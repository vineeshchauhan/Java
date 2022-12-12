import java.util.Arrays;

public class SmallestCommonNumber {

	public static void main(String[] args) {
		int[] v1 = new int[] { 6, 7, 10, 25, 30, 63, 64 };
		int[] v2 = new int[] { 0, 4, 5, 6, 7, 8, 50 };
		int[] v3 = new int[] { 1, 3, 10, 14 };
		System.out.println("Array 1: " + Arrays.toString(v1));
		System.out.println("Array 2: " + Arrays.toString(v2));
		System.out.println("Array 3: " + Arrays.toString(v3));

		Integer result = findLeastCommonNumber(v1, v2, v3);
		System.out.println("Least Common Number: " + result);
	}

	private static Integer findLeastCommonNumber(int[] v1, int[] v2, int[] v3) {

		int i = 0, j = 0, k = 0;

		while (i < v1.length && j < v2.length && k < v3.length) {
			if (v1[i] == v2[j] && v2[j] == v3[k]) {
				return v1[i];
			}
			if (v1[i] <= v2[j] && v1[i] <= v3[k]) {
				i++;
			}
			else if (v2[j] <= v1[i] && v2[j] <= v3[k]) {
				j++;
			}
			else if (v3[k] <= v1[i] && v3[k] <= v2[j]) {
				k++;
			}

		}

		return -1;
	}

}