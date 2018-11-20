package pe.edu.upeu.jdbc.controller;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import pe.edu.upeu.jdbc.entity.DetalleOp;
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
	public ModelAndView op(Model model) {
		ModelAndView mo = new ModelAndView();
		mo.setViewName("op");
		mo.addObject("list", opp.readAllop());
		model.addAttribute("orp", new OrdenProduccion());
		return mo;
	}
	@GetMapping("/dele/{id}")
	public String opdelete(Model model, @PathVariable("id") int idop) {
		System.out.println(idop);
		opp.delete(idop);
		return "redirect:/main/op";
	}
		
	@GetMapping("/opregistrar")
	public ModelAndView opregistrar(Model model, OrdenProduccion op) throws SQLException {
		ModelAndView mu = new ModelAndView();
		mu.setViewName("opregistrar");
		mu.addObject("lis", pro.readAll());
		
		return mu;
	}
	
	@PostMapping("/opregistration")
	public String opregistration(Model model, OrdenProduccion op, HttpSession session) throws SQLException {
		System.out.println(session.getAttribute("iduser").getClass());
		int idusr = session.getAttribute("iduser");
		System.out.println(idusr);
		op.setIdusuario(idusr);
		System.out.println((int) session.getAttribute("iduser"));
		
		opp.create(op);
		//JOptionPane.showMessageDialog(null, op.getFentrega());
		//ModelAndView mu = new ModelAndView();
		//mu.setViewName("opregistration");
		//mu.addObject("lis", pro.readAll());
		return "redirect:/main/opregistrar";
	}
}
