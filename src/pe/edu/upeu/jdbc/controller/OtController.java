package pe.edu.upeu.jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/main")
public class OtController {
@GetMapping("/ot")
public ModelAndView ot(Model model) {
	ModelAndView mo = new ModelAndView();
	mo.setViewName("ot");
	return mo;
}	
}
