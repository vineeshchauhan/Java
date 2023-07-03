package structural.decorator.dynamicdecorator;

public class Demo {
	
	public static void main(String [] args) {
		ColorShapeDecorator deco = new ColorShapeDecorator("Red", new Circle(4));
		
		System.out.println(deco.shapeInfo());
	}

}
