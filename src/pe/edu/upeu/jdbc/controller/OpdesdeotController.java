package pe.edu.upeu.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.entity.OrdenProduccion;
import pe.edu.upeu.jdbc.service.DetalleOpService;
import pe.edu.upeu.jdbc.service.OrdenProduccionService;

@Controller
@RequestMapping("/main")
public class OpdesdeotController {
	@Autowired
	private OrdenProduccionService opp;
	@Autowired
	private DetalleOpService des;
	
	@GetMapping("/opot")
	public ModelAndView op(Model model) {
		ModelAndView mo = new ModelAndView();
		mo.setViewName("opdesdeot");
		mo.addObject("list", opp.readAllop());
		model.addAttribute("orp", new OrdenProduccion());
		return mo;
	}
	
	@GetMapping("/detalleop")
	public ModelAndView detalleop(Model model) {
		ModelAndView mo = new ModelAndView();
		mo.setViewName("detalleop");
		System.out.println("registrarion");
		//mo.addObject("listaDetalle", des.readAll(idd));
		return mo;
	}
	
	
	
}
