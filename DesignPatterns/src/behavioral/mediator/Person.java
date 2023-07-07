package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name;
	private ChatRoom chatRoom;
	private List<String> chatLog = new ArrayList<>();

	public Person(String name) {
		super();
		this.name = name;
	}

	public void receive(String sender, String message) {
		String s = sender+ ": '"+message+"'";
		System.out.println("["+name+"'s chat session] "+s);
		chatLog.add(s);
	}
	
	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getChatLog() {
		return chatLog;
	}

	public void setChatLog(List<String> chatLog) {
		this.chatLog = chatLog;
	}

}
