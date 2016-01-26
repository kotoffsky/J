package controllers;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bussiness.service_layer.IService;
import bussiness.service_layer.IUser;
import bussiness.service_layer.IUserService;
import domain.service.Service;
import fr.unicaen.am.model.User;
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
		//Service service = new Service("service1", "description", "categorie");
		//serviceService.addService(service);
		//userServiceService.addUserService(new UserService(new Person("amani","lahbib","amani@amani.fr"),service,new Date(),new Date(),"demande"));
		SessionManager.initializeSession(session, userService);
		User user = (User)session.getAttribute("user");
		Collection<Service> services = userServiceService.getServices(user.getEmail());
		Collection<Service> userServices = userServiceService.getUserServices(user.getEmail());
		model.addAttribute("services", services);
		model.addAttribute("userServices", userServices);

        return "servicesList";
    }

}
