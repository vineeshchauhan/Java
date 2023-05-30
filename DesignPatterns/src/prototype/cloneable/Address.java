package prototype.cloneable;

public class Address implements Cloneable{
	
	private Integer streetName;
	
	private String cityName;

	public Address(Integer streetName, String cityName) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
	}

	public Integer getStreetName() {
		return streetName;
	}

	public void setStreetName(Integer streetName) {
		this.streetName = streetName;
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}

}
