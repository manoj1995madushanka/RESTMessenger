package com.library.messenger.Messanger.Database;

import java.util.HashMap;
import java.util.Map;

import com.library.messenger.Messanger.Model.Message;
import com.library.messenger.Messanger.Model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long,Profile> profiles = new HashMap<>();
	
	public static Map<Long,Message> getMessages(){
		return messages;
	}
	
	public static Map<Long,Profile> getProfiles(){
		return profiles;
	}

}
