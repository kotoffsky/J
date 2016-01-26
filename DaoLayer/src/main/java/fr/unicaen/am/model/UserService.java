package fr.unicaen.am.model;

import java.util.Date;

import domain.person.Person;
import domain.service.Service;

public class UserService {

	private Long id;
	private User person;
	private Service service;
	private Date startDate;
	private Date endDate;
	private TypeService typeService;
	private Date creationDate;

	public UserService() {
		// TODO Auto-generated constructor stub
	}

	public UserService(User person, Service service, Date startDate, Date endDate, TypeService typeService) {
		super();
		this.person = person;
		this.service = service;
		this.startDate = startDate;
		this.endDate = endDate;
		this.typeService = typeService;
	}



	public Person getPerson() {
		return person;
	}

	public void setPerson(User person) {
		this.person = person;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service serivce) {
		this.service = serivce;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public TypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "UserService [id=" + id + ", person=" + person.toString() + ", service=" + service + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

}
