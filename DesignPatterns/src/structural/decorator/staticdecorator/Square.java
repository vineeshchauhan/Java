package structural.decorator.staticdecorator;

public class Square implements Shape {
	
	public int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public String shapeInfo() {
		return "A Square of side "+side;
	}

}
