package alehad.test.messenger.model;

import java.util.Date;

//import javax.xml.bind.annotation.XmlRootElement;

import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Message {

	private long id;
	private String message;
	private String author;
	private Date createdOn;

	public Message() {
		//no-op default constructor, needed for xml/json serialization/de-serialization
	}
	

	public Message(long id, String message, String author, Date createdOn) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.createdOn = createdOn;
	}

	public Message(long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.createdOn = new Date();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
}
