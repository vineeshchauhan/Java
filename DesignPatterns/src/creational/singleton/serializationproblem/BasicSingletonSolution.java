package creational.singleton.serializationproblem;

import java.io.Serializable;

public class BasicSingletonSolution implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BasicSingletonSolution() {

	}
    // Early initialization
	// Thread Safe
	// No mechanism for exception handling
	private static final BasicSingletonSolution INSTANCE = new BasicSingletonSolution();

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static BasicSingletonSolution getBasicSingleton() {
		return INSTANCE;
	}
	
	protected Object readResolve() {
		return INSTANCE;
	}

}
