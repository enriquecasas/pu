package pe.edu.upeu.jdbc.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.entity.DetalleOp;
import pe.edu.upeu.jdbc.entity.OrdenProduccion;
import pe.edu.upeu.jdbc.service.DetalleOpService;
import pe.edu.upeu.jdbc.service.OrdenProduccionService;
import pe.edu.upeu.jdbc.service.ProductoService;

@Controller
@RequestMapping("/main")
public class OpController {
	@Autowired
	private OrdenProduccionService opp;
	@Autowired
	private ProductoService pro;
	@Autowired
	private DetalleOpService des;

	@GetMapping("/op")
	public ModelAndView op(Model model) {
		ModelAndView mo = new ModelAndView();
		mo.setViewName("/op");
		mo.addObject("list", opp.readAllop());
		model.addAttribute("orp", new OrdenProduccion());
		return mo;
	}

	@GetMapping("/dele/{id}")
	public String opdelete(Model model, @PathVariable("id") int idop) {

		opp.delete(idop);
		return "redirect:/main/op";
	}

	/*
	 * @GetMapping("/puede/{id}") public String delet(@PathVariable("id") int id) {
	 * System.out.println("hola:"id); opp.deletePro(id); return "main/opregistrar";
	 * }
	 */
	@GetMapping("/puede/{id}")
	public String delet(@PathVariable("id") int idop) {
		opp.deletePro(idop);
		return "redirect:/main/opregistrar";
	}

	@GetMapping("/opregistrar")
	public ModelAndView opregistrar(Model model, OrdenProduccion op, HttpSession session, HttpServletRequest request)
			throws SQLException {
		ModelAndView mu = new ModelAndView();
		mu.setViewName("opregistrar");
		mu.addObject("lis", pro.readAll());
		System.out.println("registrarion");
		mu.addObject("listaDetalle", des.readAll(Integer.parseInt(session.getAttribute("idOrden").toString())));
		return mu;
	}

	@PostMapping("/opregistration")
	public String opregistration(Model model, OrdenProduccion op, HttpSession session, HttpServletRequest request)
			throws SQLException {
		op.setIdusuario(Integer.parseInt(session.getAttribute("iduser").toString()));
		opp.create(op);
		System.out.println(op.getCodigo());
		session.setAttribute("idOrden", opp.getLast().get(0).values().toArray()[0]);
		session.setAttribute("cod", opp.getLast().get(0).values().toArray()[2]);
		session.setAttribute("fgen", opp.getLast().get(0).values().toArray()[3]);
		session.setAttribute("fent", opp.getLast().get(0).values().toArray()[4]);
		return "redirect:/main/opregistrar";
	}

	@PostMapping("/nuevodetalle")
	public ModelAndView nuevodetalle(Model model, DetalleOp det, HttpSession session, HttpServletRequest request)
			throws SQLException {
		det.setIdop(Integer.parseInt(session.getAttribute("idOrden").toString()));
		det.setIdproducto(Integer.parseInt(request.getParameter("idProducto")));
		det.setCantidad(Double.parseDouble(request.getParameter("cantProducto")));
		des.create(det);
		ModelAndView md = new ModelAndView();
		md.setViewName("opregistrar");
		md.addObject("lis", pro.readAll());
		System.out.println("nuevo detalle");
		md.addObject("listaDetalle", des.readAll(Integer.parseInt(session.getAttribute("idOrden").toString())));

		return md;
	}

	@GetMapping("/updaop/{id}")
	public ModelAndView detalleupdate(Model model, @PathVariable("id") int id, HttpSession session) {
		session.setAttribute("iddetalle", id);
		ModelAndView medit = new ModelAndView();
		medit.setViewName("editarOP");
		medit.addObject("productList", pro.readAll());
		medit.addObject("listaEdit", des.readAll(id));
		medit.addObject("code", opp.read(id).getCodigo());
		medit.addObject("fgene", opp.read(id).getFgeneracion());
		medit.addObject("fentr", opp.read(id).getFentrega());
		return medit;
	}

	@GetMapping("/editarOP")
	public ModelAndView editarOP(Model model, DetalleOp detalle) throws SQLException {
		ModelAndView medit = new ModelAndView();
		medit.setViewName("editarOP");
		medit.addObject("listaEdit", des.readAll(33));
		// detalle.setIdop(Integer.parseInt(session.getAttribute("iddetalle").toString()));
		// detalle.setIdproducto(Integer.parseInt(request.getParameter("idProducto")));
		// detalle.setCantidad(Double.parseDouble(request.getParameter("cantProducto")));
		des.create(detalle);
		return medit;
	}

	@PostMapping("/deldetalle/{id}")
	public String deldetalle(Model model, @PathVariable("id") int id) {
		des.delete(id);
		return "redirect:/main/nuevodetalle";
	}

}
