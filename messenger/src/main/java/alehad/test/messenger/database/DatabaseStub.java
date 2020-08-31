package alehad.test.messenger.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import alehad.test.messenger.model.Message;

public class DatabaseStub {

	private static DatabaseStub instance = null;
	
	private Map<Long, Message> messages = new HashMap<Long, Message>();
	
	private DatabaseStub() {
		// initialize messages, just to have something to play with
		messages.put(1L, new Message(1,"test", "alehad"));
		messages.put(2L, new Message(2,"hello world", "apache tomcat"));
	}
	
	public static DatabaseStub GetInstance() {
		if (instance == null) {
			instance = new DatabaseStub();
		}
		return instance;
	}
	
	public Map<Long, Message> getMessages() {
		return messages;
	}

	public void setMessages(Map<Long, Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		int id = messages.size() + 1;
		message.setId(id);
		if (message.getCreatedOn() == null) {
			message.setCreatedOn(new Date());
		}
		messages.put((long)id, message);
		return message;
	}
}
