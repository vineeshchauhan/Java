package prototype.cloneable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> names = new ArrayList<>();
		names.add("Vineesh");
		names.add("Chauhan");
		Person p = new Person(names,new Address(123, "London"));
		
		//Shallow Copy
		Person p1 = p;
		List<String> names1 = new ArrayList<>();
		names1.add("Vivek");
		names1.add("Chauhan");
		p1.setNames(names1);
		p1.setAddress(new Address(124, "London"));
		
		System.out.println("p ==p1 "+ (p == p1));
		System.out.println("p.equals(p2) "+p.equals(p1));
		
		
		System.out.println(p);
		System.out.println(p1);
		
		p = new Person(names,new Address(123, "London"));
		
		Person p2 = (Person)p.clone();
		p2.setNames(names1);
		p2.setAddress(new Address(124, "London"));
		
		System.out.println("p ==p2 "+ (p == p2));
		System.out.println("p.equals(p2) "+p.equals(p2));
		
		
		System.out.println("p  "+p);
		System.out.println("p2 "+p2);
		
	}

}
