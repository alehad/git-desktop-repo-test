package alehad.test.messenger.service;

import java.util.ArrayList;
import java.util.List;

import alehad.test.messenger.model.Message;

public class MessageService {

	private static MessageService instance;
	
	private List<Message> messages;
	
	private MessageService() {
		// initialize messages, just to have something to play with
		messages = new ArrayList<Message>();
		messages.add(new Message(1,"test", "alehad"));
		messages.add(new Message(2,"hello world", "author2"));
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
