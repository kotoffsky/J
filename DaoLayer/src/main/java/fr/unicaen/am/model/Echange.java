package fr.unicaen.am.model;

import java.io.Serializable;

import domain.service.Service;

public class Echange implements Serializable{
	
	private Long id;
	private User offrant;
	private User demandeur;
	private Service service;
	private Boolean accepted;
	private Cycle cycle;
	
	public Echange() {
	}
	
	public Echange(User offrant, User demandeur, Service service, Cycle cycle) {
		this.offrant = offrant;
		this.demandeur = demandeur;
		this.service = service;
		this.cycle = cycle;
	}



	public Echange(User offrant, User demandeur, Service service) {
		this.offrant = offrant;
		this.demandeur = demandeur;
		this.service = service;
	}
	public User getOffrant() {
		return offrant;
	}
	public void setOffrant(User offrant) {
		this.offrant = offrant;
	}
	public User getDemandeur() {
		return demandeur;
	}
	public void setDemandeur(User demandeur) {
		this.demandeur = demandeur;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}

	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}

	@Override
	public String toString() {
		return "Echange [offrant=" + offrant + ", demandeur=" + demandeur + ", service=" + service + "]";
	}

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
