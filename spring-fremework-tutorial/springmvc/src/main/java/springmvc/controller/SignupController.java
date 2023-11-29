package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@Controller
public class SignupController {

	@ModelAttribute
	public void setCommonData(Model model) {
		model.addAttribute("pageName", "Signup");
	}

	@RequestMapping(path = "signup", method = RequestMethod.GET)
	public String showForm(Model model) {
		return "signup";
	}

	@RequestMapping(path = "signup", method = RequestMethod.POST)
	public String signUpFormHandler(@ModelAttribute User user, Model model) {

		if (user.getUserEmail() == "" || user.getUserEmail().trim().isEmpty()) {
			model.addAttribute("userEmailErr", "Email is required.");
			System.out.println("Email is required.");
		}

		if (user.getUserPassword() == "" || user.getUserPassword().trim().isEmpty()) {
			model.addAttribute("userPasswordErr", "Password is required.");
			System.out.println("Password is required.");
		}

		System.out.println("===========================");
		System.out.println(model);
		System.out.println(user);

		return "signup";
	}

}
