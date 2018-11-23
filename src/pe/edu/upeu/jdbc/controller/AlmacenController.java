package pe.edu.upeu.jdbc.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.jdbc.entity.Kardex;
import pe.edu.upeu.jdbc.service.AlmacenService;

@Controller
public class AlmacenController {
	@Autowired
	private AlmacenService alm;
	
	@GetMapping("main/almacen")
	public ModelAndView almacen(Model model) {
		ModelAndView mi = new ModelAndView();
		mi.setViewName("almacen");
		mi.addObject("listAlm", alm.readAll2());
		model.addAttribute("orp", new Kardex());
		return mi;
	}
	
	@PostMapping("main/almacenbuscar")
	public ModelAndView almacenbuscar(Model model, HttpServletRequest request) {
		ModelAndView mi = new ModelAndView();
		mi.setViewName("almacen");
		mi.addObject("listAlm", alm.readAll2());
		mi.addObject("listaProd", alm.readAll(Integer.parseInt(request.getParameter("idProducto"))));
		model.addAttribute("orp", new Kardex());
		return mi;
	}
	
	
	
}
