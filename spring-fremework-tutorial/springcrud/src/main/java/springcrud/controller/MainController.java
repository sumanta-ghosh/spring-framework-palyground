package springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springcrud.dao.ProductDao;
import springcrud.model.Product;

@Controller
public class MainController {

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Dashboard");
		List<Product> products = productDao.getProducts();
		model.addAttribute("products", products);
		return "index";
	}

	@RequestMapping("/product/add")
	public String addProduct(Model model) {
		model.addAttribute("pageTitle", "Add Product");
		return "add";
	}

}
