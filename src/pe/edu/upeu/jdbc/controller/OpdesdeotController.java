package pe.edu.upeu.jdbc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.entity.DetalleOt;
import pe.edu.upeu.jdbc.entity.OrdenProduccion;
import pe.edu.upeu.jdbc.entity.OrdenTrabajo;
import pe.edu.upeu.jdbc.service.DetalleOpService;
import pe.edu.upeu.jdbc.service.DetalleOtService;
import pe.edu.upeu.jdbc.service.OrdenProduccionService;
import pe.edu.upeu.jdbc.service.OrdenTrabajoService;

@Controller
@RequestMapping("/main")
public class OpdesdeotController {
	@Autowired
	private OrdenProduccionService opp;
	@Autowired
	private DetalleOpService des;
	@Autowired
	private OrdenTrabajoService ots;
	@Autowired
	private DetalleOtService dos;

	@GetMapping("/opot")
	public ModelAndView op(Model model) {
		ModelAndView mo = new ModelAndView();
		mo.setViewName("opdesdeot");
		mo.addObject("list", opp.readAllop());
		model.addAttribute("orp", new OrdenProduccion());
		return mo;
	}

	@GetMapping("/detalleop/{id}")
	public ModelAndView detalleop(Model model, @PathVariable("id") int idop, OrdenTrabajo ot,
			HttpServletRequest request, HttpSession session) {
		ModelAndView mo = new ModelAndView();
		mo.setViewName("detalleop");
		// System.out.println("hola ahi estamos ");
		mo.addObject("code", opp.read(idop).getCodigo());
		mo.addObject("fgene", opp.read(idop).getFgeneracion());
		mo.addObject("fentr", opp.read(idop).getFentrega());
		mo.addObject("idop", idop);
		mo.addObject("listaopot", des.readAll(idop));
		ot = new OrdenTrabajo(idop, Integer.parseInt(session.getAttribute("iduser").toString()));
		ots.create(ot);
		return mo;
	}
	/*
	 * @GetMapping("/detalleop") public ModelAndView detalleop(Model model) {
	 * ModelAndView mo = new ModelAndView(); mo.setViewName("detalleop");
	 * System.out.println("registrarion"); //mo.addObject("listaDetalle",
	 * des.readAll(idd)); return mo; }
	 */

	@RequestMapping("/registraOT/{id}")
	public String registraot(Model model, OrdenTrabajo ot, DetalleOt dot, @PathVariable("id") int id,
			HttpSession session, HttpServletRequest req) {
		//System.out.println(des.read(id).get(0).values().toArray()[4].toString() + " cant");
		//System.out.println(des.read(id).get(0).values().toArray()[2].toString() + " idpr");
		dot = new DetalleOt();
		dot.setIdot(id);
		dot.setCantidad(Double.parseDouble(des.read(id).get(0).values().toArray()[4].toString()));
		dot.setIdproducto(Integer.parseInt(des.read(id).get(0).values().toArray()[4].toString()));
		dos.create(dot);

		return "redirect:/main/op";
	}

}

