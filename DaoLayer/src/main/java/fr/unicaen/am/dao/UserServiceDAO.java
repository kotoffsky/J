package fr.unicaen.am.dao;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.service.Service;
import fr.unicaen.am.model.UserService;

@Repository
public class UserServiceDAO implements IUserServiceDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createUserService(UserService service) throws Exception {
		getCurrentSession().save(service);
		
	}

	@Override
	public void updateUserService(UserService service) throws Exception {
		getCurrentSession().update(service);
		
	}

	@Override
	public UserService retrieveUserService(long id) throws Exception {
		UserService service = (UserService) getCurrentSession().get(Service.class, id);
		return service;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<UserService> retrieveAll() throws Exception {
		return getCurrentSession().createQuery("from UserService").list();
	}

	@Override
	public void deleteUserService(long id) throws Exception {
		UserService service = retrieveUserService(id);
		if (service != null)
			getCurrentSession().delete(service);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Service> retrieveServices(String email) throws Exception {
		return getCurrentSession().createQuery("select s from Service s, UserService us where us.service = s and us.person.email!='"+email+"'").list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Service> retrieveUserServices(String email) throws Exception {
		return getCurrentSession().createQuery("select s from Service s, UserService us where us.service = s and us.person.email='"+email+"'").list();
	}
	
}
