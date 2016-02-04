package controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bussiness.service_layer.ICycleService;
import bussiness.service_layer.IUser;
import bussiness.service_layer.IUserService;
import fr.unicaen.am.dao.IEchangeDAO;
import fr.unicaen.am.model.Cycle;
import fr.unicaen.am.model.Echange;
import fr.unicaen.am.model.User;
import fr.unicaen.am.model.UserService;
import utils.CycleManager;
import utils.SessionManager;

@Controller
public class CycleController {

	@Autowired
	private ICycleService cycleService;

	@Autowired
	private IUser userService;

	@Autowired
	private IUserService userServiceService;

	@Autowired
	private IEchangeDAO echangeDao;

	private static List<List<Echange>> echanges;

	@RequestMapping(value = "/searchcycle/{id}", method = RequestMethod.GET)
	public String searchCycles(@PathVariable("id") long id, HttpSession session, Model model) {
		SessionManager.initializeSession(session, userService);
		User user = (User) session.getAttribute("user");
		UserService userService = userServiceService.retrieveUserService(id);
		if (userService != null)
			echanges = new CycleManager().searchCycle(user, userService.getService(), userServiceService);
		model.addAttribute("cycle", echanges);
		return "cycle";
	}

	@RequestMapping(value = "/requestechange/{index}/{id}", method = RequestMethod.GET)
	public String requestEchange(@PathVariable("index") int index, @PathVariable("id") long id, HttpSession session,
			Model model) {
		Cycle c = new Cycle(userServiceService.retrieveUserService(id));
		boolean added = cycleService.addCycle(c, echanges.get(index));
		if (added)
			return "redirect:/home";
		else {
			model.addAttribute("error",
					"une erreur s'est produite !! La demande n'est pas transmise, essayer de nouveau SVP");
			return "cycle";
		}

	}

}
