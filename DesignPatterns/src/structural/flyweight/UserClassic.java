package structural.flyweight;

/**
 * saves each name as seperate string, can cause space issues.
 *
 */
public class UserClassic {

	String fullUserName;

	public UserClassic(String fullUserName) {
		this.fullUserName = fullUserName;
	}

	@Override
	public String toString() {
		return fullUserName + "\n";
	}
	
}
