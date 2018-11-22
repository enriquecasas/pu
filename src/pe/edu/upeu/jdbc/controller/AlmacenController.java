package pe.edu.upeu.jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlmacenController {
	
	@GetMapping("main/almacen")
	public String almacen() {
		
		return "almacen";
	}
	
}
