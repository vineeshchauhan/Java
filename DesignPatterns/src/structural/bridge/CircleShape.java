package structural.bridge;

public class CircleShape implements Shape{

	public CircleShape(Color color) {
		System.out.println(color.getColor()+" Circle");
	}
	
	@Override
	public Shape getShape(Color color) {
		return new CircleShape(color);
		
	}

}
