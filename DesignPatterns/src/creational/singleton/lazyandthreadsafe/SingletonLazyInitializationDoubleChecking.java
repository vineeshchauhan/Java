package creational.singleton.lazyandthreadsafe;

public class SingletonLazyInitializationDoubleChecking {

	private int value;
	
	private SingletonLazyInitializationDoubleChecking() {

	}

	private static SingletonLazyInitializationDoubleChecking instance = null;

	// instance is created only when needed.
	public static SingletonLazyInitializationDoubleChecking getInstance() {
		if (instance == null) {
			synchronized (SingletonLazyInitializationDoubleChecking.class) {
				if (instance == null) {
					instance = new SingletonLazyInitializationDoubleChecking();
				}
			}
		}
		return instance;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
