package structural.flyweight;

import java.util.ArrayList;
import java.util.List;


public class Demo {
	public static void main(String[] args) {
		
		UserClassic user1 = new UserClassic("John Smith");
		UserClassic user2 = new UserClassic("Jane Smith");
		
		List<UserClassic> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		System.out.println(user1 + "  "+ user2);
		
		System.out.println("");
		// optimized
		UserSpaceOptimized user3 = new UserSpaceOptimized("John Smith");
		int [] user3Name = user3.names;
		UserSpaceOptimized user4 = new UserSpaceOptimized("Jane Smith");
		int [] user4Name = user4.names;
		
		List<UserSpaceOptimized> list1 = new ArrayList<>();
		list1.add(user3);
		list1.add(user4);
		
		System.out.println(user3.getName(user3Name));
		System.out.println(user4.getName(user4Name));
		
		
		
	}

}
