package com.library.messenger.Messanger.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.library.messenger.Messanger.Database.DatabaseClass;
import com.library.messenger.Messanger.Model.Message;

public class MessageService {
	
	private static Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		this.messages.put(1L, new Message(1L, "Hello Manoj", "Manoj"));
		this.messages.put(2L, new Message(2L, "Hello World", "Manoj"));
	}
	
	public List<Message> getAllMessages(){
		
		//passing a collection to the arraylist constructor initialized the list with those elements
		return new ArrayList<Message>(messages.values());
		
		/*
		 * Message m1 = new Message(1L, "Hello Manoj", "Manoj"); Message m2 = new
		 * Message(2L, "Hello World", "Manoj"); List <Message> list = new
		 * ArrayList<Message>();
		 */
		/*
		 *  GenericEntity<List<Message>>
		 * entity = new GenericEntity<List<Message>>(list) {};
		 */
		// Response response = Response.ok(entity).build();
		/*
		 * list.add(m1); list.add(m2); return list;
		 */
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);;
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId()<=0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
