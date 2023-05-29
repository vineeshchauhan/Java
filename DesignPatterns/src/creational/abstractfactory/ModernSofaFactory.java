package creational.abstractfactory;

public class ModernSofaFactory implements Chair{

	private void hasLegs() {
		// TODO Auto-generated method stub
		
	}

	private void sitOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Chair buildChair() {
		hasLegs();
		sitOn();
		System.out.println("Modern sofa built");
		return this;
	}

}
