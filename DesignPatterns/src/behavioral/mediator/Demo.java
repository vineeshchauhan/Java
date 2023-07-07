package behavioral.mediator;

public class Demo {

	public static void main(String[] args) {
		ChatRoom room = new ChatRoom();
		
		Person p1 = new Person("Mukesh");
		Person p2 = new Person("Harish");
		Person p3 = new Person("Vikas");
		
		room.join(p1);
		room.join(p2);
		
		room.oneToOneMessage("Hi Harish", p1, p2);
		room.oneToOneMessage("Hi Mukesh", p2, p1);
		
		room.join(p3);
		
		room.broadcastMessage("Hello Everyone, I am here.", p3);
		
		
	}
}
