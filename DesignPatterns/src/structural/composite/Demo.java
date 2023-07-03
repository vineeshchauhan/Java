package structural.composite;

public class Demo {

	public static void main(String[] args) {
		
		// The client is able to invoke same methods on Graphic and Compound Graphic

		Graphic dot = new Dot(1, 2);
		Graphic circle = new Circle(1, 2, 3);

		// working directly with Graphic
		System.out.println("Working with Graphic");
		dot.move(1, 2);
		dot.draw();

		// working directly with CompoundGraphic
		System.out.println(System.lineSeparator()+"Working with CompoundGraphic");
		CompoundGraphic cGraphic = new CompoundGraphic();
		cGraphic.add(dot);
		cGraphic.add(circle);
		cGraphic.move(1, 2);
		cGraphic.draw();
		// Add another CompoundGraphic in CompoundGraphic, Tree like structure
		System.out.println("");
		System.out.println(System.lineSeparator()+"Working with CompoundGraphic and Graphic");
		CompoundGraphic cGraphic1 = new CompoundGraphic();
		cGraphic1.add(circle);
		cGraphic1.add(cGraphic);

		cGraphic1.move(1, 2);
		cGraphic1.draw();
	}
}
