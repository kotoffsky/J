package fr.unicaen.am.dao;

import java.util.List;

import fr.unicaen.am.model.Cycle;
import fr.unicaen.am.model.User;
import fr.unicaen.am.model.UserService;

public interface ICycleDAO {

	Long createCycle(Cycle cycle) throws Exception;

	void updateCycle(Cycle cycle) throws Exception;

	Cycle retrieveCycle(long id) throws Exception;

	List<Cycle> retrieveAll() throws Exception;

	void deleteCycle(long id) throws Exception;
	
	List<Cycle> retrieveByUserServices(UserService userService) throws Exception;
	
	List<Cycle> getByOffrant(User user);
	List<Cycle> getByDemandeur(User user);

}
