package pe.edu.upeu.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.entity.Kardex;
import pe.edu.upeu.jdbc.entity.OrdenProduccion;
import pe.edu.upeu.jdbc.service.AlmacenService;
import pe.edu.upeu.jdbc.service.OrdenProduccionService;

@Controller
public class AlmacenController {
	@Autowired
	private AlmacenService alm;
	/*@GetMapping("main/almacen")
	public String almacen() {
		
		return "almacen";
	}*/
	@GetMapping("main/almacen")
	public ModelAndView op(Model model) {
		ModelAndView mi = new ModelAndView();
		mi.setViewName("almacen");
		mi.addObject("listaProd", alm.readAll());
		model.addAttribute("orp", new Kardex());
		return mi;
	}
}
