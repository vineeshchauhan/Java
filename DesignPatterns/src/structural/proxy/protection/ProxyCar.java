package structural.proxy.protection;

public class ProxyCar extends Car {

	Driver driver;
	
	public ProxyCar(Driver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@Override
	public void drive() {
		if(driver.getAge() > 18 ) {
			System.out.println("Drive driven by "+driver.getName() +" of age "+driver.getAge());
		}else {
			System.out.println("Drive driven by a minor of age"+driver.getAge()+" It is not legal.");
		}
	}

}
