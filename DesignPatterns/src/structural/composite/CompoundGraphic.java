package structural.composite;

import java.util.ArrayList;

public class CompoundGraphic extends ArrayList<Graphic> implements Graphic {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean add(Graphic graphic) {
		return super.add(graphic);
	}

	@Override
	public boolean remove(Object o) {
		return super.remove(o);
	}

	@Override
	public void move(int x, int y) {
		this.forEach(graphic -> graphic.move(x, y));
	}

	@Override
	public void draw() {
		this.forEach(graphic -> graphic.draw());
	}

}
