package pe.edu.upeu.jdbc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.entity.DetalleOt;
import pe.edu.upeu.jdbc.entity.OrdenTrabajo;
import pe.edu.upeu.jdbc.service.DetalleOpService;
import pe.edu.upeu.jdbc.service.DetalleOtService;
import pe.edu.upeu.jdbc.service.OrdenTrabajoService;

@Controller
@RequestMapping("/main")
public class OtController {
	@Autowired
	private DetalleOtService dos;
	@Autowired
	private OrdenTrabajoService ots;
	@Autowired
	private DetalleOpService des;

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

	@RequestMapping("/registrarDOT")
	public String registrarDOT(Model model, OrdenTrabajo ot, DetalleOt dot, HttpServletRequest req) {
		int id = Integer.parseInt(ots.getLast().get(0).values().toArray()[0].toString());
		System.out.println(des.read(id).get(0));
		dot = new DetalleOt(id,
				Double.parseDouble(req.getParameter("cant")), Integer.parseInt(req.getParameter("idprod")));
		dos.create(dot);
		return "redirect:/main/detalleop/"+id;
	}
}
