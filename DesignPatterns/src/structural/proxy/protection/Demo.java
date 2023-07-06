package structural.proxy.protection;

public class Demo {
	public static void main(String[] args) {
		
		Car car = new Car(new Driver("Mukesh", 15));
		car.drive();
		
		// New restriction came about driver age. Can't modify Car.
		Car car1 = new ProxyCar(new Driver("Mukesh", 15));
		car1.drive();
		
		car1 = new ProxyCar(new Driver("Amit", 20));
		car1.drive();
	}
}
