package structural.bridge;

public class Demo {

	public static void main(String[] args) {
		Shape greenCircle = new CircleShape(new Color("Green"));
		Shape redCircle = new CircleShape(new Color("Red"));

		Shape greenSquare = new SquareShape(new Color("Green"));
		Shape redSquare = new SquareShape(new Color("Red"));
		
		Shape greenTriangle = new TriangleShape(new Color("Green"));
		Shape redTriangle = new TriangleShape(new Color("Red"));
		
	}

}
