package springcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Dashboard");
		return "index";
	}

	@RequestMapping("/product/add")
	public String addProduct(Model model) {
		model.addAttribute("pageTitle", "Add Product");
		return "add";
	}

}
