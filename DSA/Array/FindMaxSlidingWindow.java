import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class FindMaxSlidingWindow {

	private static List<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {

		List<Integer> result = new ArrayList<>();

		int i = 0, j = 0;
		Deque<Integer> deque = new ArrayDeque<>();
		for (int k = 0; k < arr.length; k++) {
			//remove from the end indexes of all the elements which are smaller than current element
			while (!deque.isEmpty() && arr[k] > arr[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.offer(k);//add the element in the end
			if (j - i + 1 == windowSize) {
				result.add(arr[deque.peekFirst()]);//Add the top of the queue to result
				j++;
				i++;
				if (i > deque.peek()) {// if the top element is out of new window, remove it.
					deque.poll();
				}
			} else {
				j++;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] targetList = { 3, 2, 1, 2 };
		int[][] numsList = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
				{ 10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67 }, { 4, 5, 6, 1, 2, 3 },
				{ 9, 5, 3, 1, 6, 3 } };
		for (int i = 0; i < targetList.length; i++) {
			System.out.println((i + 1) + ". Original list:\t" + Arrays.toString(numsList[i]));
			System.out.println("   Window size:\t\t" + targetList[i]);
			List<Integer> ouput = findMaxSlidingWindow(numsList[i], targetList[i]);
			System.out.println("   Max:\t\t\t" + ouput);
			System.out.println(
					"-----------------------------------------------------------------------------------------------------\n");
		}
	}

}
