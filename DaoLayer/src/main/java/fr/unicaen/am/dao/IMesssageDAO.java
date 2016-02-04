package fr.unicaen.am.dao;

import java.util.List;

import fr.unicaen.am.model.Comment;
import fr.unicaen.am.model.UserService;

public interface IMesssageDAO extends domain.chat.IMesssageDAO {
	
	List<Comment> retrieveByUserService(UserService userService) throws Exception;
	List<Comment> retrieveBySender(Object sender) throws Exception;
	List<Comment> retrieveByReceiver(Object receiver) throws Exception;
	
}
