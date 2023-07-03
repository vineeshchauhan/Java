package structural.decorator.staticdecorator;

public class Circle implements Shape{
	
	public float radius;
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String shapeInfo() {
		return "The circle of radius "+radius;
	}

}
