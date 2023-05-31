package prototype.serializable;

import java.io.Serializable;

public class CopyConstructorExample {
	public static void main(String[] args) {
		// Deep Copy
		Address s1 = new Address(123, "Delhi");
		Address s2 = org.apache.commons.lang3.SerializationUtils.clone(s1);

		s2.setCityName("Noida");
		// the change in s2 doesn't reflect in s1.
		System.out.println(s1);
		System.out.println(s2);

	}

}

class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer streetName;
	private String cityName;

	public Address(Integer streetName, String cityName) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
	}

	public Address(Address add) {
		this.streetName = add.streetName;
		this.cityName = add.cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", cityName=" + cityName + "]";
	}

}
