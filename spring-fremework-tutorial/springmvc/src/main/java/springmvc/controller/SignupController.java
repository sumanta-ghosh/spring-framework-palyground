package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

	@RequestMapping(path = "signup", method = RequestMethod.GET)
	public String showForm(Model model) {
		model.addAttribute("pageName", "Signup");
		return "signup";
	}

	@RequestMapping(path = "signup", method = RequestMethod.POST)
	public ModelAndView signUpFormHandler(@RequestParam("userEmail") String userEmail, @RequestParam String userPassword, @RequestParam(name = "iAgree", required = false) String iAgree) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageName", "Signup");
		mv.addObject("userEmail", userEmail);
		mv.addObject("userPassword", userPassword);
		System.out.println("===========================");
		System.out.println(userEmail);
		System.out.println(userPassword);
		System.out.println(iAgree);

		if (userEmail == null || userEmail.trim().isEmpty()) {
			mv.addObject("userEmailErr", "Email is required.");
			System.out.println("Email is required.");
		}

		if (userPassword == null || userPassword.trim().isEmpty()) {
			mv.addObject("userPasswordErr", "Password is required.");
			System.out.println("Password is required.");
		}

		mv.setViewName("signup");
		return mv;
	}

}
