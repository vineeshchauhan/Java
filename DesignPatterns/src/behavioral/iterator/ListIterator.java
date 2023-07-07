package behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class ListIterator<E> implements Iterator<E>{
	
	List<E> list;
	int current= 0;

	public ListIterator(List<E> list) {
		super();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return list.size() > current && list.get(current) != null;
	}

	@Override
	public E next() {
		return list.get(current++);
	}
	

}
