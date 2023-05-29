package creational.abstractfactory;

public class VictorianSofaFactory implements Chair{

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
		System.out.println("Victorian sofa built");
		return this;
	}

}
