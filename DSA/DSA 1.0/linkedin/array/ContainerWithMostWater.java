package linkedin.array;

public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int max = 0;
		int i = 0;
		int j = height.length - 1;

		while (i < j) {

			int result = ((height[i] > height[j]) ? height[j] : height[i]) * (j - i);
			max = (result > max) ? result : max;

			if (height[i] > height[j]) {
				j--;
			} else {
				i++;
			}
		}

		System.out.println(max);
	}
}
