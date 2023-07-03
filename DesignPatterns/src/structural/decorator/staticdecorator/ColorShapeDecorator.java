package structural.decorator.staticdecorator;

import java.util.function.Supplier;

import structural.decorator.dynamicdecorator.Shape;

public class ColorShapeDecorator<T extends Shape> implements Shape{

	public String color;

	public Shape shape;

	public ColorShapeDecorator(String color, Supplier<? extends T> constructor) {
		super();
		this.color = color;
		this.shape = constructor.get();
	}

	@Override
	public String shapeInfo() {
		return shape.shapeInfo() + " and of color " + color;
	}

}
