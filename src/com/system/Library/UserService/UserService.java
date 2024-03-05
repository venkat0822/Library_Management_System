package com.system.Library.UserService;
import java.util.LinkedList;

import com.system.Library.UserData.UserData;

public class UserService {
	
	UserData user= new UserData();
	public LinkedList<UserData> usersList = user.returnList();
	
	public UserData returnUser(String username) {
		
		for(UserData user : usersList) {
			
			if(user.getUserName().equals(username))
				return user;
		}
		return null;
	}
	
	public boolean validate(String username, String password) {
		
		for(UserData user: usersList) {
			
			if(user.getUserName().equals(username) && user.getPassword().equals(password))
				return true;
		}
		return false;
	}
	
	
}
