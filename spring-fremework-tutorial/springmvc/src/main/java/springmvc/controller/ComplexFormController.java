package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComplexFormController {

	@RequestMapping(path = "/complex-form", method = RequestMethod.GET)
	public String complexForm() {
		return "complex-form";
	}

	@RequestMapping(path = "/handle-complex-form", method = RequestMethod.POST)
	public String complexFormHandle() {
		return "redirect:complex-form?t=1";
	}

}
