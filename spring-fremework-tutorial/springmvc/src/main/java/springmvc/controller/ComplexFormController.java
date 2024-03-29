package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entity.Student;

@Controller
public class ComplexFormController {

	@RequestMapping(path = "/complex-form", method = RequestMethod.GET)
	public String complexForm() {
		return "complex-form";
	}

	@RequestMapping(path = "/handle-complex-form", method = RequestMethod.POST)
	public String complexFormHandle(@ModelAttribute("student") Student student, BindingResult result) {
		System.out.println(student);
		System.out.println(result);
		if (result.hasErrors()) {
			return "complex-form";
		}
		return "redirect:complex-form?t=1";
	}

}
