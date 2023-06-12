package structural.bridge;

public class SquareShape implements Shape{
	
	public SquareShape(Color color) {
		System.out.println(color.getColor()+ " Square");
	}

	@Override
	public Shape getShape(Color color) {
		return new SquareShape(color);
	}

}
