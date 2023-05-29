package creational.abstractfactory;

/**
 * It is created as Factory just for illustration. 
 * @author Vineesh.Chauhan
 *
 */
public class ModernChairFactory implements Chair {

	private void hasLegs() {

	}

	private void sitOn() {

	}

	@Override
	public Chair buildChair() {
		hasLegs();
		sitOn();
		System.out.println("Modern chair built");
		return this;
	}

}
