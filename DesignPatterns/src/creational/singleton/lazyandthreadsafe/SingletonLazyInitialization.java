package creational.singleton.lazyandthreadsafe;

public class SingletonLazyInitialization {
	
	private int value;
	private SingletonLazyInitialization() {
		
	}

	private static SingletonLazyInitialization instance = null;
	
	// instance is created only when needed.
	public static SingletonLazyInitialization getInstance() {
		if(instance == null) {
			instance = new SingletonLazyInitialization();
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
