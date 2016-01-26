package fr.unicaen.am.dao;

import java.util.Collection;

import domain.service.Service;
import fr.unicaen.am.model.UserService;

public interface IUserServiceDAO {

	void createUserService(UserService service) throws Exception;

	void updateUserService(UserService service) throws Exception;

	UserService retrieveUserService(long id) throws Exception;

	Collection<UserService> retrieveAll() throws Exception;

	void deleteUserService(long id) throws Exception;

	Collection<Service> retrieveServices(String email) throws Exception;

	Collection<Service> retrieveUserServices(String email) throws Exception;

}
