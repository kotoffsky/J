package bussiness.service_layer;

import java.util.Collection;
import java.util.List;

import domain.service.Service;

/**
 * Interface de manipulation sur un service de l'application
 * @author LAHBIB Amani, KHARAIM Nikita - Universit� de Caen Normandie, France
 * @since january, 2016
 * @see Service
 */
public interface IService {

	/**
	 * Cr�ation d'un service
	 * @param service Service � cr�er
	 * @return R�sultat de cr�ation
	 */
	boolean addService (Service service);
	
	/**
	 * Mise � jour d'un service
	 * @param service Service � mettre � jour
	 * @return R�sultat de mise � jour
	 */
	boolean updateService (Service service);
	
	/**
	 * R�cup�rer un service avec un id pr�cis
	 * @param id
	 * @return
	 */
	Service getService (long id);
	
	/**
	 * R�cup�rer tout les services
	 * @return Liste de services
	 */
	Collection<Service> getAllServices();
	
	/**
	 * R�cup�rer les services par une cat�gorie pr�cise
	 * @param category Cat�gorie
	 * @return Liste des services filtr� par une cat�gorie
	 */
	Collection<Service> getCategoryServices (String category);
	
	/**
	 * R�cup�rer toutes les cat�gories de services
	 * @return Liste de cat�gories
	 */
	Collection<String> getAllCategories();
	
	/**
	 * Suppression d'un service
	 * @param id Id pr�cis d'un service � supprimer
	 * @return R�sultat de suppression
	 */
	boolean removeService(long id);
	
	/**
	 * R�cup�rer labels de services
	 * @return Liste de labels
	 */
	List<String> getServicesLabel();
}
