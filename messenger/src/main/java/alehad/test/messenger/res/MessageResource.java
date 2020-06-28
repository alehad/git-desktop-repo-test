package alehad.test.messenger.res;

import java.util.List;

import alehad.test.messenger.model.Message;
import alehad.test.messenger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("messages")
public class MessageResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_XML)
	//@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Message> getMessages() {
		return MessageService.GetInstance().GetMessages();
	}
}
