package springcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@RequestMapping(name = "product/add", method = RequestMethod.GET)
	public String viewAddForm(Model model) {
		model.addAttribute("pageTitle", "Add Product");
		return "add";
	}

	@RequestMapping(name = "product/add", method = RequestMethod.POST)
	public String handleAddForm(Model model) {
		model.addAttribute("pageTitle", "Add Product");
		return "add";
	}

}
