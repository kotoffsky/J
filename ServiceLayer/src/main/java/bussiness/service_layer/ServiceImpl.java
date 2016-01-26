package bussiness.service_layer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.service.IServiceDAO;



@Service
@Transactional
public class ServiceImpl implements IService{
	
	@Autowired
	private IServiceDAO serviceDAO;


	@Override
	public boolean addService(domain.service.Service service) {
		try {
			serviceDAO.createService(service);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updateService(domain.service.Service service) {
		try {
			serviceDAO.updateService(service);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public domain.service.Service getService(long id) {
		try {
			return serviceDAO.retrieveService(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Collection<domain.service.Service> getAllServices() {
		try {
			return serviceDAO.retrieveAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Collection<domain.service.Service> getCategoryServices(String category) {
		try {
			return serviceDAO.retrieveByCategory(category);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Collection<String> getAllCategories() {
		try {
			return serviceDAO.retrieveAllCategories();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean removeService(long id) {
		try {
			serviceDAO.deleteService(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
