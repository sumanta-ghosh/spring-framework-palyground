package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url...");
		model.addAttribute("pageName", "Home..");
		List<String> friends = new ArrayList<String>();
		friends.add("Sumanta");
		friends.add("Prad");
		friends.add("Abhi");
		model.addAttribute("friends", friends);
		return "index";
	}

	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public ModelAndView about() {
		System.out.println("This is about url...");
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageName", "about............");
		mv.setViewName("about");
		return mv;
	}

	@RequestMapping("/contact-us")
	public String contactUs(Model model) {
		System.out.println("This is contact-us url...");
		model.addAttribute("pageName", "contact-us..");
		return "contact-us";
	}
}
