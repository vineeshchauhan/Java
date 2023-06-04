package creational.singleton.dependencyinjection;

import java.util.List;

public class ConfigurablePopulationRegistry {

	private Database database;

	public ConfigurablePopulationRegistry(Database database) {
		super();
		this.database = database;
	}

	public int getPopuldationCount(List<String> cities) {

		int count = 0;
		for (String city : cities) {
			count += database.getPopulation(city);
		}
		return count;
	}
}
