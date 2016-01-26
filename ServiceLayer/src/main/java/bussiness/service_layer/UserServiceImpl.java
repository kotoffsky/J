package bussiness.service_layer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.unicaen.am.dao.IUserServiceDAO;
import fr.unicaen.am.model.UserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserServiceDAO dao;

	@Override
	public void addUserService(UserService service){
		try {
			dao.createUserService(service);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateUserService(UserService service){
		try {
			dao.updateUserService(service);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public UserService retrieveUserService(long id){
		try {
			return dao.retrieveUserService(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Collection<UserService> retrieveAll(){
		try {
			return dao.retrieveAll();
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void deleteUserService(long id){
		try {
			dao.deleteUserService(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Collection<domain.service.Service> getServices(String email){
		try {
			return dao.retrieveServices(email);
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}
	
	@Override
	public Collection<domain.service.Service> getUserServices(String email){
		try {
			return dao.retrieveUserServices(email);
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}

}
