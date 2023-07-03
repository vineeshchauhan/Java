package structural.composite;

public class Dot implements Graphic {
	
	int x,y;
	
	public Dot(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println("Move Dot to :x "+this.x+" :y "+this.y);
	}

	@Override
	public void draw() {
		System.out.println("Draw a Dot");
	}

}
