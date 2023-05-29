package creational.abstractfactory;

public class ModernFurnitureFactory implements FurnitureFactory{

	@Override
	public Chair orderChair() {
		return new ModernChairFactory().buildChair(); 
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
