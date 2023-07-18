import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();

		int[] nums = { 1,1,1,1 };
		int target = 2;

		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int ref = target - nums[i];
			if (map.keySet().contains(ref)) {
				int val = map.get(ref);
				result[0] = i;
				result[1] = val;
				System.out.println(Arrays.toString(result));
			}
			map.put(nums[i], i);
		}
	}
}