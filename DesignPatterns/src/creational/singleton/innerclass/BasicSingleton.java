package creational.singleton.innerclass;

public class BasicSingleton {

	private BasicSingleton() {

	}
	// Thread Safe
	private static class Impl {
		private static final BasicSingleton INSTANCE = new BasicSingleton(); 
	}

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static BasicSingleton getBasicSingleton() {
		return Impl.INSTANCE;
	}

}
