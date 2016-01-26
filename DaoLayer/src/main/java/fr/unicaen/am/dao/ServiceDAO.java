package fr.unicaen.am.dao;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.service.IServiceDAO;
import domain.service.Service;

@Repository
public class ServiceDAO implements IServiceDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createService(Service service) throws Exception {
		getCurrentSession().save(service);
		
	}

	@Override
	public void updateService(Service service) throws Exception {
		getCurrentSession().update(service);
		
	}

	@Override
	public Service retrieveService(long id) throws Exception {
		Service service = (Service) getCurrentSession().get(Service.class, id);
		return service;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Service> retrieveAll() throws Exception {
		return getCurrentSession().createQuery("from Service").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Service> retrieveByCategory(String category) throws Exception {
		return getCurrentSession().createQuery("from Service where category='"+category+"'").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<String> retrieveAllCategories() throws Exception {
		return getCurrentSession().createQuery("select category from Service").list();
	}

	@Override
	public void deleteService(long id) throws Exception {
		Service service = retrieveService(id);
		if (service != null)
			getCurrentSession().delete(service);
		
	}
	
}
