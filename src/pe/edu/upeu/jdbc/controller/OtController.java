package pe.edu.upeu.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.jdbc.service.DetalleOtService;


@Controller
@RequestMapping("/main")
public class OtController {
	@Autowired
	private DetalleOtService dos;
	
	
	
@GetMapping("/ot")
public ModelAndView ot(Model model) {
	ModelAndView mo = new ModelAndView();
	mo.setViewName("ot");
	return mo;
}	

@GetMapping("/detalleot")
public ModelAndView detalleot(Model model) {
	ModelAndView mo = new ModelAndView();
	mo.setViewName("detalleot");
	mo.addObject("listDet", dos.readAll());
	
	return mo;
}

}
