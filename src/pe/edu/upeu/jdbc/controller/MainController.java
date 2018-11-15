package pe.edu.upeu.jdbc.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.daoImp.OrdenProduccionDaoImp;
import pe.edu.upeu.jdbc.entity.Usuario;
import pe.edu.upeu.jdbc.service.OrdenProduccionService;
import pe.edu.upeu.jdbc.service.UsuarioService;
import pe.edu.upeu.jdbc.serviceImp.OrdenProduccionServiceImp;
import pe.edu.upeu.jdbc.serviceImp.UsuarioServiceImp;

@Controller
@RequestMapping("/main")
public class MainController {
	@Autowired
	private UsuarioService usp;

	/*
	 * @PostMapping("/bienvenido") public String main() { return "main"; }
	 */
	@PostMapping("/bienvenido")
	public ModelAndView main2(Model model, Usuario user, HttpServletRequest httpServletRequest) {
		HttpSession httpSession = httpServletRequest.getSession();
		ModelAndView andView = new ModelAndView();
		try {
			//JOptionPane.showMessageDialog(null,user.);
			if (usp.validaUser(user) != null) {
			
				andView.setViewName("main");
				httpSession.setAttribute("user", user.getNomuser());
				//httpSession.setAttribute("user", user.getIduser());
				andView.addObject("user", (String) httpSession.getAttribute("user"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			andView.setViewName("redirect:/");
		}

		return andView;
	}

	@GetMapping("/user")
	public ModelAndView user() {
		// JOptionPane.showMessageDialog(null, "estas aqui");
		ModelAndView ma = new ModelAndView();
		ma.setViewName("user");
		ma.addObject("lista", usp.readAll());
		return ma;
	}

	@GetMapping("/del/{id}")
	public String userdelete(Model model, @PathVariable("id") int idusuario) {
		System.out.println(idusuario);
		usp.delete(idusuario);
		return "redirect:/main/user";
	}

	@GetMapping("/upd/{id}")
	public String userupdate(Model model, @PathVariable("id") int idusuario) {
		Usuario u = usp.read(idusuario);
		model.addAttribute("user", u);
		return "editarUser";
	}

	@PostMapping("/saveUser")
	public String usersave(Model model, Usuario user) throws SQLException {
		user.setEstado("1");
		usp.create(user);
		return "redirect:/main/user";
	}

	@GetMapping("/editarUser/{id}")
	public String useredit(Model model) throws SQLException {
		return "redirect:/main/editarUser";
	}

	
}
