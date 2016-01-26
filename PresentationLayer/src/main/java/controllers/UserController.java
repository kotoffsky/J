package controllers;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bussiness.service_layer.IUser;
import domain.person.Person;

@Controller
public class UserController {
    
    @Autowired
    private IUser userService;

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public String list(Model model) {
    	//userService.addUser(new Person("amani","lahbib","test@test.fr"), "amani");
        Collection<Person> users = userService.getAllUsers();
        model.addAttribute("users", users);

        return "user";
    }
    /*
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "index";
    }
    
   
    
    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {
        model.addAttribute("error", "true");
        return "denied";
    }*/

}

