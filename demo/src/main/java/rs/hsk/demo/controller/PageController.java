package rs.hsk.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import rs.hsk.demobackend.dao.UserDAO;

@Controller
public class PageController {
	
	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = { "/", "/home", "/index", "/page" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value={"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("userClickAbout", true);
		return mv;

	}
	@RequestMapping(value={"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		//creating list of user
		mv.addObject("users", userDAO.list());
		mv.addObject("userClickContact", true);
		return mv;

	}
		

	@RequestMapping(value={"/test"})
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("userClickTest", true);
		return mv;

	}
	
	
}
