package structural.proxy.protection;

public class Car implements Driveable {

	Driver driver;
	
	public Car(Driver driver) {
		this.driver = driver;
	}
	
	@Override
	public void drive() {
		System.out.println("Drive driven by "+driver.getName() +" of age "+driver.getAge());
	}

}
