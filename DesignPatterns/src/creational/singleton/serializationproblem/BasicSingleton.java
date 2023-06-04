package creational.singleton.serializationproblem;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
