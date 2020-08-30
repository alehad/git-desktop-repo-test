package alehad.test.messenger.service;

import java.util.ArrayList;
import java.util.List;

import alehad.test.messenger.database.DatabaseStub;
import alehad.test.messenger.model.Message;

public class MessageService {

	private static MessageService instance;
	
	private List<Message> messages = new ArrayList<Message>(DatabaseStub.GetInstance().getMessages().values());
	
	private MessageService() {
		// empty as messages now initialized at DB stub level
	}
	
	public static MessageService GetInstance() {
		if (instance == null) {
			instance = new MessageService();
		}
		return instance;
	}
	
	public List<Message> GetMessages() {
		return messages;
	}
	
}
