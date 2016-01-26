package controllers;


import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bussiness.service_layer.IService;
import domain.service.Service;

@Controller
public class ServiceController {
    
    @Autowired
    private IService serviceService;

    @RequestMapping(value="/services", method = RequestMethod.GET)
    public String list(Model model) {
        Collection<Service> services = serviceService.getAllServices();
        model.addAttribute("services", services);

        return "servicesList";
    }
    
    

}

