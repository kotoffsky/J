package model;

import domain.service.Service;
import fr.unicaen.am.model.User;

/**
 * Classe représentante un échange entre les utilisateurs
 * @author LAHBIB Amani, KHARAIM Nikita - Université de Caen Normandie, France
 * @since January, 2016
 * @see User
 * @see Service
 */
public class Echange {
	/**
	 * Utilisateur qui offre un service
	 */
	private User offrant;
	
	/**
	 * Utilisateur qui demande un service
	 */
	private User demandeur;
	
	/**
	 * Service dans l'échange entre les utilisateurs
	 */
	private Service service;
	
	/**
	 * Contructeur de base
	 */
	public Echange() {
	}
	
	/**
	 * Constructeur avec des paramètres
	 * @param offrant Instance de l'utilisateur offrant
	 * @param demandeur Instance de l'utilisateur demandant
	 * @param service Service dans l'échange
	 */
	public Echange(User offrant, User demandeur, Service service) {
		super();
		this.offrant = offrant;
		this.demandeur = demandeur;
		this.service = service;
	}
	
	/**
	 * Geter de l'utilisateur qui offre
	 * @return Instance de l'utilisateur offrant
	 */
	public User getOffrant() {
		return offrant;
	}
	
	/**
	 * Setter de l'utilisateur qui offre
	 * @param offrant Instance de l'utilisateur offrant
	 */
	public void setOffrant(User offrant) {
		this.offrant = offrant;
	}
	
	/**
	 * Getter de l'utilisateur qui demande
	 * @return Instance de l'utilisateur demandant
	 */
	public User getDemandeur() {
		return demandeur;
	}
	
	/**
	 * Setter de l'utilisateur qui demande
	 * @param demandeur Instance de l'utilisateur demandant
	 */
	public void setDemandeur(User demandeur) {
		this.demandeur = demandeur;
	}
	
	/**
	 * Getter du service de l'échange
	 * @return Instance de service
	 */
	public Service getService() {
		return service;
	}
	
	/**
	 * Setter de serivce de l'échange
	 * @param service Instance de service de l'échange
	 */
	public void setService(Service service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "Echange [offrant=" + offrant + ", demandeur=" + demandeur + ", service=" + service + "]";
	}
	
	
	

}
