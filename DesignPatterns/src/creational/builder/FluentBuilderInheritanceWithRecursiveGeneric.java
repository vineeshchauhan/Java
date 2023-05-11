package creational.builder;

class City {
	String name;
	Integer area;

	@Override
	public String toString() {
		return "City [name=" + name + ", area=" + area + "]";
	}

}

class CityNameBuilder<T extends CityNameBuilder<T>> {

	City city = new City();

	T buildCityName(String name) {
		city.name = name;
		return returnT();
	}

	City buildCity() {
		return city;
	}

	T returnT() {
		return (T) this;
	}

}

class CityAreaBuilder extends CityNameBuilder<CityAreaBuilder> {

	CityAreaBuilder buildCityArea(Integer area) {
		city.area = area;
		return returnT();
	}

	CityAreaBuilder returnT() {
		return super.returnT();

	}

}

public class FluentBuilderInheritanceWithRecursiveGeneric {

	public static void main(String[] args) {
		// CityNameBuilder cnb = new CityNameBuilder().buildCityName("Delhi"). Problem

		City city = new CityAreaBuilder().buildCityName("Delhi").buildCityArea(100).buildCity();

		System.out.println(city.toString());

	}

}
