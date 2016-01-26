package bussiness.service_layer;

import java.util.Collection;

import domain.service.Service;
import fr.unicaen.am.model.UserService;

public interface IUserService {
	void addUserService(UserService service);

	void updateUserService(UserService service);

	UserService retrieveUserService(long id);

	Collection<UserService> retrieveAll();

	void deleteUserService(long id);

	Collection<Service> getServices(String email);

	Collection<Service> getUserServices(String email);


}
