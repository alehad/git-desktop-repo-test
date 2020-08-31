package alehad.test.messenger.res;

import java.util.List;

import alehad.test.messenger.model.Message;
import alehad.test.messenger.service.MessageService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("messages")
public class MessageResource {
	
	private static MessageService service = MessageService.GetInstance();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_XML)
	//@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Message> getMessages() {
		return service.GetMessages();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long id) {
		return service.getMessage(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		return service.addMessage(message);
	}
}
