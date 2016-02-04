package fr.unicaen.am.dao;

import java.util.List;

import fr.unicaen.am.model.Cycle;
import fr.unicaen.am.model.Echange;
import fr.unicaen.am.model.UserService;

public interface IEchangeDAO {

	void createEchange(Echange echange) throws Exception;

	void updateEchange(Echange echange) throws Exception;

	Echange retrieveEchange(long id) throws Exception;

	List<Echange> retrieveAll() throws Exception;

	void deleteEchange(long id) throws Exception;
	
	void deleteEchangeByCycleId(long id) throws Exception;

	List<Echange> retrieveByCycle(Cycle cycle) throws Exception;

}
