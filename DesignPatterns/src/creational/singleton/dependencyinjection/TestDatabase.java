package creational.singleton.dependencyinjection;

import java.util.HashMap;
import java.util.Map;

public class TestDatabase implements Database {

	Map<String, Integer> map = null;

	public TestDatabase() {
		map = new HashMap<>();

		map.put("Delhi", 10);
		map.put("Noida", 20);
		map.put("Gurgoan", 30);

	}

	@Override
	public int getPopulation(String name) {
		return map.get(name);
	}

}
