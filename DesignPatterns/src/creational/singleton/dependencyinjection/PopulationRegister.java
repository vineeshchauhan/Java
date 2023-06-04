package creational.singleton.dependencyinjection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationRegister {

	static Map<String, Integer> map = null;

	private PopulationRegister() {
		map = new HashMap<>();
		map.put("Delhi", 100);
		map.put("Gurgoan", 200);
		map.put("Noida", 300);
	}

	public static int getPopulation(List<String> cities) {
		int count = 0;
		if (map == null)
			new PopulationRegister();
		for (String city : cities) {
			count += map.get(city);
		}
		return count;
	}

}
