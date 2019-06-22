package rs.hsk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/add")
public class ManagementController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView showAddUser() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickAddUser", true);
		mv.addObject("tile", "Add User");
		return mv;
	}
}
