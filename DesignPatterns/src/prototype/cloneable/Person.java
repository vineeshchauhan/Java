package prototype.cloneable;

import java.util.List;

public class Person implements Cloneable {
	
	// ArrayList provide shallow copy.
	private List<String> names;
	
	private Address address;
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(List<String> names, Address address) {
		this.names = names;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [names=" + names + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//List<String> names1 = this.names;
		//System.out.println(names1);
		return (Person) super.clone();
		//p.setNames(names1);
		//return p;
	}

}
