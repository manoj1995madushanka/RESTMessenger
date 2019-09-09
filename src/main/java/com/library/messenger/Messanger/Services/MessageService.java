package com.library.messenger.Messanger.Services;

import java.util.ArrayList;
import java.util.List;


import com.library.messenger.Messanger.Model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello Manoj", "Manoj");
		Message m2 = new Message(2L, "Hello World", "Manoj");
		List <Message> list = new ArrayList<Message>();
		/*
		 *  GenericEntity<List<Message>>
		 * entity = new GenericEntity<List<Message>>(list) {};
		 */
		// Response response = Response.ok(entity).build();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
