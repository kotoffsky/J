package model;

import domain.service.Service;
import fr.unicaen.am.model.User;

public class Echange {
	
	private User offrant;
	private User demandeur;
	private Service service;
	
	public Echange() {
		// TODO Auto-generated constructor stub
	}
	
	public Echange(User offrant, User demandeur, Service service) {
		super();
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

	@Override
	public String toString() {
		return "Echange [offrant=" + offrant + ", demandeur=" + demandeur + ", service=" + service + "]";
	}
	
	
	

}
