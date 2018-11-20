package pe.edu.upeu.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.entity.DetalleOp;
import pe.edu.upeu.jdbc.service.DetalleOpService;
import pe.edu.upeu.jdbc.service.ProductoService;


@Controller
public class ProductoController {
	
	@Autowired
	private DetalleOpService detalleOpService;
	
	@PostMapping("detaop/save")
	public String saveDetalle(@ModelAttribute("detaop")DetalleOp deOp) {		
		detalleOpService.saveDetalleOp(deOp);		
		return "opregistrar";
	}
	
}
