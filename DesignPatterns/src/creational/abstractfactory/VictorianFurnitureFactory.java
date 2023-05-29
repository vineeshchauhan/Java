package creational.abstractfactory;

public class VictorianFurnitureFactory implements FurnitureFactory{

	@Override
	public Chair orderChair() {
		return new VictorianChairFactory().buildChair();
	}

	@Override
	public Sofa orderSofa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CofferTale orderCofferTale() {
		// TODO Auto-generated method stub
		return null;
	}

}
