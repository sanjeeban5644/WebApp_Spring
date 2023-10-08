package com.sanjeeban.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
//0479aa10-971d-4129-827d-bb75c120ed7d

@Controller
@SessionAttributes("name")
public class WelcomeController {

	@RequestMapping(value="/", method = RequestMethod.GET)    // Mapping a request url to this method.
	public String gotoHomePage(ModelMap model) {
//		model.put("name", "Sanjeeban");// this hardcoding has to be removed.
		model.put("name",getLoggedinUsername());
		return "homePage"; // this should map to the jsp file name without the .jsp
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
		}
}
