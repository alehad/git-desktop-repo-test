package alehad.test.messenger.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import alehad.test.messenger.model.Message;

public class DatabaseStub {

	private static DatabaseStub instance = null;
	
	private Map<Long, Message> messages = new HashMap<Long, Message>();
	
	// this is needed in order not to overwrite messages in case there were some deletes
	// which were then followed by adds/inserts
	private long lastCreatedMessageId = 0;
	
	private DatabaseStub() {
		// initialize messages, just to have something to play with
		messages.put(1L, new Message(1,"test", "alehad"));
		messages.put(2L, new Message(2,"hello world", "apache tomcat"));
		lastCreatedMessageId = 2;
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
		message.setId(++lastCreatedMessageId);
		if (message.getCreatedOn() == null) {
			message.setCreatedOn(new Date());
		}
		messages.put(lastCreatedMessageId, message);
		return message;
	}

	public Message updateMessage(long id, Message message) {
		message.setId(id);
		message.setCreatedOn(new Date()); // eg Updated On
		messages.replace(id, message);
		return message;
	}

	public void deleteMessage(long id) {
		messages.remove(id);
	}
}
