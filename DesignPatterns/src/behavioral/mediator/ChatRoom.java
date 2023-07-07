package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

	List<Person> peopleList = new ArrayList<>();

	public void join(Person p) {
		peopleList.add(p);
		p.setChatRoom(this);
		broadcastMessage("Hi, Everyone", p);
	}

	public void broadcastMessage(String message, Person person) {
		for (Person p : peopleList) {
			if (!p.getName().equals(person.getName())) {
				p.receive(message, person.getName());
			}
		}
	}

	public void oneToOneMessage(String message, Person sender, Person receiver) {
		peopleList.stream().filter(p -> p.getName().equals(receiver.getName())).findFirst().ifPresent(person -> person.receive(message, sender.getName()));
	}
}
