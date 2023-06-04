package creational.singleton.lazyandthreadsafe;

public class Demo {

	public static void main(String[] args) {

		SingletonLazyInitialization instance_1 = SingletonLazyInitialization.getInstance();
		instance_1.setValue(100);
		SingletonLazyInitialization instance_11 = SingletonLazyInitialization.getInstance();
		System.out.println(instance_1.getValue());
		System.out.println(instance_11.getValue());
		
		SingletonLazyInitializationThreadSafe instance_2 = SingletonLazyInitializationThreadSafe.getInstance();
		instance_2.setValue(100);
		SingletonLazyInitializationThreadSafe instance_22 = SingletonLazyInitializationThreadSafe.getInstance();
		System.out.println(instance_2.getValue());
		System.out.println(instance_22.getValue());
		
		SingletonLazyInitializationDoubleChecking instance_3 = SingletonLazyInitializationDoubleChecking.getInstance();
		instance_3.setValue(100);
		SingletonLazyInitializationDoubleChecking instance_33 = SingletonLazyInitializationDoubleChecking.getInstance();
		System.out.println(instance_3.getValue());
		System.out.println(instance_33.getValue());
	}

}
