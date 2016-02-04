package controllers;


import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bussiness.service_layer.IUser;
import domain.person.Person;
import fr.unicaen.am.model.User;
import fr.unicaen.am.model.UserService;

@Controller
public class UserController {
    
    @Autowired
    private IUser userService;

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public String list(Model model,HttpSession session) {
    	
        Collection<Person> users = userService.getAllUsers();
        users.remove((User)session.getAttribute("user"));
        model.addAttribute("users", users);

        return "user";
    }
    
    @RequestMapping(value="/removeuser/{email:.+}", method = RequestMethod.GET)
    public String deleteService(@PathVariable("email") String email,HttpSession session, Model model) {
		System.out.println(email);
    	userService.deleteUser(email);
        return "redirect:/users";
    }

}

