package creational.singleton.dependencyinjection;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Delhi","Noida");
		
		System.out.println(PopulationRegister.getPopulation(list));
		
		
		ConfigurablePopulationRegistry conf = new ConfigurablePopulationRegistry(new ProdDatabase());
		
		System.out.println(conf.getPopuldationCount(list));
		
		
		ConfigurablePopulationRegistry conf1 = new ConfigurablePopulationRegistry(new TestDatabase());
		
		System.out.println(conf1.getPopuldationCount(list));
	}

}
