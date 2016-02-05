package bussiness.service_layer;

import java.util.Collection;
import java.util.List;

import domain.service.Service;

/**
 * Interface de manipulation sur un service de l'application
 * @author LAHBIB Amani, KHARAIM Nikita - Université de Caen Normandie, France
 * @since january, 2016
 * @see Service
 */
public interface IService {

	/**
	 * Création d'un service
	 * @param service Service à créer
	 * @return Résultat de création
	 */
	boolean addService (Service service);
	
	/**
	 * Mise à jour d'un service
	 * @param service Service à mettre à jour
	 * @return Résultat de mise à jour
	 */
	boolean updateService (Service service);
	
	/**
	 * Récupérer un service avec un id précis
	 * @param id
	 * @return
	 */
	Service getService (long id);
	
	/**
	 * Récupérer tout les services
	 * @return Liste de services
	 */
	Collection<Service> getAllServices();
	
	/**
	 * Récupérer les services par une catégorie précise
	 * @param category Catégorie
	 * @return Liste des services filtré par une catégorie
	 */
	Collection<Service> getCategoryServices (String category);
	
	/**
	 * Récupérer toutes les catégories de services
	 * @return Liste de catégories
	 */
	Collection<String> getAllCategories();
	
	/**
	 * Suppression d'un service
	 * @param id Id précis d'un service à supprimer
	 * @return Résultat de suppression
	 */
	boolean removeService(long id);
	
	/**
	 * Récupérer labels de services
	 * @return Liste de labels
	 */
	List<String> getServicesLabel();
}
