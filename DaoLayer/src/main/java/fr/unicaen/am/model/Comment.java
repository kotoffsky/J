package fr.unicaen.am.model;

import domain.chat.Message;
import domain.person.Person;

public class Comment extends Message{

	private static final long serialVersionUID = 3430894879093773912L;
	protected UserService userService;
	
	public Person getSender() {
		return (Person)sender;
	}
	public void setSender(Person sender) {
		this.sender = sender;
	}
	public Person getReceiver() {
		return (Person)receiver;
	}
	public void setReceiver(Person receiver) {
		this.receiver = receiver;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
}
