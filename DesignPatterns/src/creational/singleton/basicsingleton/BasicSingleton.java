package creational.singleton.basicsingleton;

public class BasicSingleton {

	private BasicSingleton() {

	}
    // Early initialization
	// Thread Safe
	// No mechanism for exception handling
	private static final BasicSingleton INSTANCE = new BasicSingleton();

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static BasicSingleton getBasicSingleton() {
		return INSTANCE;
	}

}
