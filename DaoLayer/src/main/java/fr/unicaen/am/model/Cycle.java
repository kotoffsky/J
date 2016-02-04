package fr.unicaen.am.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cycle implements Serializable{
	
	private static final long serialVersionUID = -2649639552038732420L;
	private Long id;
	private UserService userService;
	private List<Echange> echanges = new ArrayList<Echange>();
	
	public Cycle() {
	}

	public Cycle(UserService userService) {
		this.userService = userService;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<Echange> getEchanges() {
		return echanges;
	}

	public void setEchanges(List<Echange> echange) {
		this.echanges = echange;
	}

	@Override
	public String toString() {
		return "Cycle [id=" + id + ", userService=" + userService + ", echanges=" + echanges + "]";
	}

	
}
