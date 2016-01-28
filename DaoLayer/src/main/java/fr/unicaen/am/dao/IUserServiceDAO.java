package fr.unicaen.am.dao;

import java.util.Collection;
import java.util.List;

import domain.service.Service;
import fr.unicaen.am.model.User;
import fr.unicaen.am.model.UserService;

public interface IUserServiceDAO {

	void createUserService(UserService service) throws Exception;

	void updateUserService(UserService service) throws Exception;

	UserService retrieveUserService(long id) throws Exception;

	Collection<UserService> retrieveAll() throws Exception;

	void deleteUserService(long id) throws Exception;

	Collection<UserService> retrieveUserServices(User user) throws Exception;

	Collection<UserService> retrieveUserServicesOffert(String email) throws Exception;

	Collection<UserService> retrieveUserServicesDemande(String email) throws Exception;

	void deleteOldServices() throws Exception;

	List<domain.service.Service> getServicesDemande(String email);

	List<User> getPersonsOfferingService(domain.service.Service s);

}
