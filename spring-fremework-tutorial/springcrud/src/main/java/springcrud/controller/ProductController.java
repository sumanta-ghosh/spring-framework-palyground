package springcrud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import springcrud.dao.ProductDao;
import springcrud.model.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductDao productDao;

	@RequestMapping(path = "product/add", method = RequestMethod.GET)
	public String viewAddForm(Model model) {
		model.addAttribute("pageTitle", "Add Product");
		return "add";
	}

	@RequestMapping(path = "product/add", method = RequestMethod.POST)
	public RedirectView handleAddForm(@ModelAttribute Product product, RedirectAttributes ra, HttpServletRequest req) {
		productDao.createProduct(product);
		ra.addFlashAttribute("successMsg", "Product added successfully");
		RedirectView rv = new RedirectView(req.getContextPath() + "/product/add");
		return rv;
	}

	@RequestMapping(path = "product/edit/{id}", method = RequestMethod.GET)
	public String viewEditForm(@PathVariable("id") int id, Model model) {
		Product product = productDao.getProduct(id);
		model.addAttribute("product", product);
		return "edit";
	}

	@RequestMapping(path = "product/edit/{id}", method = RequestMethod.POST)
	public String handleEditForm(@PathVariable("id") int id, @ModelAttribute Product product, RedirectAttributes rd) {
		productDao.updateProduct(product);
		rd.addFlashAttribute("successMsg", "Product updated successfully");
		return "redirect:/product/edit/" + id;
	}

}
