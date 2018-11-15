package pe.edu.upeu.jdbc.controller;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.entity.OrdenProduccion;
import pe.edu.upeu.jdbc.entity.Usuario;
import pe.edu.upeu.jdbc.service.OrdenProduccionService;
import pe.edu.upeu.jdbc.service.ProductoService;

@Controller
@RequestMapping("/main")

public class OpController {
	@Autowired
	private OrdenProduccionService opp;
	@Autowired
	private ProductoService pro;
	
	@GetMapping("/op")
	public ModelAndView op() {
		ModelAndView mo = new ModelAndView();
		mo.setViewName("op");
		mo.addObject("list", opp.readAllop());
		return mo;
	}
	
	@GetMapping("opregistrar")
	public ModelAndView opregistrar(Model model, OrdenProduccion op) throws SQLException {
		opp.create(op);
		//JOptionPane.showMessageDialog(null, "estas aqui");
		ModelAndView mu = new ModelAndView();
		mu.setViewName("opregistrar");
		mu.addObject("lis", pro.readAll());
		return mu;
	}
	
	
}
