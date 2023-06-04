package creational.singleton.lazyandthreadsafe;

public class SingletonLazyInitializationThreadSafe {

	private int value;
	
	private SingletonLazyInitializationThreadSafe() {

	}

	private static SingletonLazyInitializationThreadSafe instance = null;

	// instance is created only when needed.
	public static synchronized SingletonLazyInitializationThreadSafe getInstance() {
		if (instance == null) {
			instance = new SingletonLazyInitializationThreadSafe();
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
