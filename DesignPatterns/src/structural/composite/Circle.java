package structural.composite;

public class Circle implements Graphic {
	
	int x,y,z;
	
	public Circle(int x, int y,int z) {
		this.z += z;
	}

	@Override
	public void move(int x, int y) {
		this.x+=x;
		this.y+=y;
		System.out.println("Move Circle by x: "+this.x+" y: "+this.y+" z: "+this.z);
	}

	@Override
	public void draw() {
		System.out.println("Draw a Circle");
	}
}
