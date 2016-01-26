package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bussiness.service_layer.IUser;
import fr.unicaen.am.model.User;
import model.UserBean;

@Controller
public class LoginController {

	@Autowired
	private IUser userService;

	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
		}

		model.setViewName("index");

		return model;

	}

	// customize the error message
	private String getErrorMessage(HttpServletRequest request, String key) {

		Exception exception = (Exception) request.getSession().getAttribute(key);

		String error = "";
		if (exception instanceof BadCredentialsException) {
			error = "Email et/ou mot de passe invalides!";
		} else if (exception instanceof LockedException) {
			error = exception.getMessage();
		} else {
			error = "Email et/ou mot de passe invalides!";
		}

		return error;
	}

	// for 403 access denied page
	@RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	public String accesssDenied() {

		return "denied";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "index";
	}
	
	@RequestMapping(value = "/inscription", method = RequestMethod.GET)
	public String signup(ModelMap model) {
		UserBean user = new UserBean();
        model.addAttribute("user", user);
		return "inscription";
	}
	
	@RequestMapping(value = "/inscription", method = RequestMethod.POST)
	 public String saveRegistration(@Valid UserBean user, BindingResult result, ModelMap model){
		 
        if(result.hasErrors()) {
                return "inscription";
        }
 
        User u = new User();
        u.setName(user.getName());
        u.setFirstName(user.getFirstname());
        u.setEmail(user.getEmail());
        u.setBirth(user.getBirthDate());
        u.setAdress(user.getAdress());
        u.setEnabled(true);
        u.setGender(user.getGender());
        u.setPassword(user.getPwd());
        u.setPays(user.getCountry());
        u.setVille(user.getCity());
        u.setPhone(user.getPhone());
        u.setPhoneType(user.getType());
        userService.addUser(u, user.getPwd());
        model.addAttribute("success", "Dear "+ user.getFirstname()+" , your Registration completed successfully");
        return "redirect:/login";
    }
	
	

}