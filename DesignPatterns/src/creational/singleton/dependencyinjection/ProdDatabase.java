package creational.singleton.dependencyinjection;

import java.util.HashMap;
import java.util.Map;

public class ProdDatabase implements Database {
	Map<String, Integer> map = null;

	public ProdDatabase() {
		// actually read from DB or file system
		map = new HashMap<>();

		map.put("Delhi", 100);
		map.put("Gurgoan", 200);
		map.put("Noida", 300);
		
	}

	@Override
	public int getPopulation(String name) {
		return map.get(name);
	}
}
