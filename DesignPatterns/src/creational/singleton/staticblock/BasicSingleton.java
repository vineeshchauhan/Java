package creational.singleton.staticblock;

public class BasicSingleton {

	private BasicSingleton() throws Exception {

	}
	// Early initialization
	// Thread Safe
	// No mechanism for exception handling

	private static BasicSingleton instance;
	static {
		try {
			instance = new BasicSingleton();
		} catch (Exception e) {

		}
	}

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static BasicSingleton getBasicSingleton() {
		return instance;
	}

}
