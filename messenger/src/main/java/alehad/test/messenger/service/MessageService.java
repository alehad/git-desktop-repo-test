package alehad.test.messenger.service;

import java.util.ArrayList;
import java.util.List;

import alehad.test.messenger.database.DatabaseStub;
import alehad.test.messenger.model.Message;

public class MessageService {

	private static MessageService instance;
	
	private static DatabaseStub db = DatabaseStub.GetInstance();
	
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
		return new ArrayList<Message>(db.getMessages().values());
	}
	
	public Message getMessage(long id)
	{
		//return messages.get((int) id);
		return db.getMessages().get(id);
	}
	
	public Message addMessage(Message message)
	{
		return db.addMessage(message);
	}
}
