package structural.bridge;

public class TriangleShape implements Shape {
	
	public TriangleShape(Color color) {
		System.out.println(color.getColor()+" Shape");
	}

	@Override
	public Shape getShape(Color color) {
		return new TriangleShape(color);
	}

}
