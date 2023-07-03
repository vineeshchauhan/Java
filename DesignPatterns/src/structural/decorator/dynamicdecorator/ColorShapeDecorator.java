package structural.decorator.dynamicdecorator;

/**
 * @author Vineesh.Chauhan
 * 
 * 
 * The Circle and Square are closed for modification and open for extension.
 * So, to add color to shapes, we can use decorator.(aggregate)
 *
 */
public class ColorShapeDecorator implements Shape {
	
	public String color;
	
	public Shape shape;

	public ColorShapeDecorator(String color, Shape shape) {
		super();
		this.color = color;
		this.shape = shape;
	}

	@Override
	public String shapeInfo() {
		return shape.shapeInfo()+" and of color "+color;
	}
	
	
	
}
