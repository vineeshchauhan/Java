package prototype.copyconstructor;

import java.util.ArrayList;

public class CopyConstructorExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		// Deep Copy - as all variables are primitive or immutable
		Address s1 = new Address(123, "Delhi");
		Address s2 = (Address) s1.clone();
		s2.setCityName("Noida");
		// the change in s2 doesn't reflect in s1.
		System.out.println(s1);
		System.out.println(s2);

		// Shallow Copy using ArrayList
		Address a1 = new Address(123, "Delhi");
		ArrayList<Address> list = new ArrayList<>();
		list.add(a1);
		ArrayList<Address> list1 = (ArrayList<Address>) list.clone();
		// update the a1 and set City to
		a1.setCityName("Noida");
		// list city is Noida and list1 city is Noida
		System.out.println(list);
		System.out.println(list1);

		// Deep Copy using ArrayList
		Address a2 = new Address(123, "Delhi");
		ArrayList<Address> list2 = new ArrayList<>();
		list2.add(a2);
		// invoke method for deep cloning
		ArrayList<Address> list4 = copyList(list2);
		// update the a1 and set City to
		a2.setCityName("Noida");

		// list city is Noida and list4 city is Delhi
		System.out.println(list);
		System.out.println(list4);

	}

	private static ArrayList<Address> copyList(ArrayList<Address> list3) throws CloneNotSupportedException {
		ArrayList<Address> clone = new ArrayList<Address>(list3.size());
		for (Address item : list3)
			clone.add(new Address(item));
		return clone;
	}
}

class Address implements Cloneable {
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
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", cityName=" + cityName + "]";
	}

}
