package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bussiness.service_layer.IService;
import bussiness.service_layer.IUser;
import bussiness.service_layer.IUserService;
import domain.service.Service;
import fr.unicaen.am.model.User;
import fr.unicaen.am.model.UserService;
import utils.Cycle;
import utils.SessionManager;

@Controller
public class HomeController {
	
	@Autowired
    private IUserService userServiceService;
	
	@Autowired
    private IUser userService;
	
	@Autowired
    private IService serviceService;
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
    public String home(HttpSession session,Model model) {
		//userServiceService.removeOldServices();
		SessionManager.initializeSession(session, userService);
		User user = (User)session.getAttribute("user");
		List<User> users = new ArrayList<>();
		Collection<UserService> us= userServiceService.retrieveAll();
		Iterator<UserService> it = us.iterator();
		while (it.hasNext()){
			User userw = ((UserService)it.next()).getPerson();
			//if(!userw.getEmail().equals(user.getEmail()))
			users.add(userw);
		}
		new Cycle().searchCycle(user, serviceService.getService(3), userServiceService);
		Collection<UserService> userServicesOffert = userServiceService.getUserServicesOffert(user.getEmail());
		Collection<UserService> userServicesDemande = userServiceService.getUserServicesDemande(user.getEmail());
		model.addAttribute("userServicesDemande", userServicesDemande);
		model.addAttribute("userServicesOffert", userServicesOffert);
        return "servicesList";
    }
	
	@RequestMapping(value="/remove/{id}", method = RequestMethod.GET)
    public String deleteService(@PathVariable("id") long id,HttpSession session, Model model) {
		userServiceService.deleteUserService(id);
		User user = (User)session.getAttribute("user");
		Collection<UserService> userServices = userServiceService.getUserServices(user);
		model.addAttribute("userServices", userServices);

        return "redirect:/home";
    }

}
