package creational.abstractfactory;

public class Client {

	public static void main(String[] args) {
		
		FurnitureFactory factory = null;
		String model = args[0];
		String type = args[1];
		if("Modern".equals(model))
			 factory = new ModernFurnitureFactory();
		else if("Victorian".equals(model))
			factory = new VictorianFurnitureFactory();

		Furniture furniture = null;
		if ("Chair".equals(type)) {
			furniture = factory.orderChair();
		}else if("Sofa".equals(type))
			furniture = factory.orderSofa();
	}

}
