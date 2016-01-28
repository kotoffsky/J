package controllers;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bussiness.service_layer.IService;
import bussiness.service_layer.IUserService;
import domain.service.Service;
import fr.unicaen.am.model.TypeService;
import fr.unicaen.am.model.User;
import fr.unicaen.am.model.UserService;
import model.ServiceBean;

@Controller
public class ServiceController {

	@Autowired
	private IService serviceService;
	
	@Autowired
	private IUserService userServiceService;

	@RequestMapping(value = "/services", method = RequestMethod.GET, headers = "Accept=*/*")
	public @ResponseBody String getServicesList() {
		return serviceService.getServicesLabel().toString();
	}
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET, headers = "Accept=*/*")
	public @ResponseBody String getCategoriesList() {
		return serviceService.getAllCategories().toString();
	}
	
	

	@RequestMapping(value = "/ajouterService", method = RequestMethod.GET)
	public String ajouter(ModelMap model) {
		ServiceBean service = new ServiceBean();
		model.addAttribute("service", service);
		return "ajoutService";
	}
	
	@RequestMapping(value = "/ajouterService", method = RequestMethod.POST)
	 public String saveservice(@Valid ServiceBean service, BindingResult result, ModelMap model,HttpSession session){
		 
       if(result.hasErrors()) {
               return "ajouterService";
       }

       Service s = new Service();
       s.setCategorie(service.getCategorie());
       s.setDescription(service.getDesc());
       s.setTitle(service.getTitle());
       
       UserService us = new UserService();
       us.setCreationDate(new Date());
       us.setStartDate(service.getDebut());
       us.setEndDate(service.getFin());
       us.setService(s);
       us.setPerson((User)session.getAttribute("user"));
       us.setTypeService(TypeService.OFFRE);
       
       serviceService.addService(s);
       userServiceService.addUserService(us);
       return "redirect:/home";
   }

}
