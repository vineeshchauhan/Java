package creational.singleton.innerclass;

public class Demo {

	public static void main(String[] args) {
		
		BasicSingleton instance = BasicSingleton.getBasicSingleton();
		instance.setValue(100);
		
		BasicSingleton instance_1 = BasicSingleton.getBasicSingleton();
		
		System.out.println(instance == instance_1);
		
		System.out.println(instance.getValue() == instance_1.getValue());
		
	}

}
