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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.daoImp.OrdenProduccionDaoImp;
import pe.edu.upeu.jdbc.entity.Usuario;
import pe.edu.upeu.jdbc.service.OrdenProduccionService;
import pe.edu.upeu.jdbc.service.UsuarioService;
import pe.edu.upeu.jdbc.serviceImp.OrdenProduccionServiceImp;
import pe.edu.upeu.jdbc.serviceImp.UsuarioServiceImp;

@Controller
public class MainController {
	@Autowired
	private UsuarioService usp;

	@PostMapping("main/bienvenido")
	public String main2(@ModelAttribute("usuario") Usuario user, Model model, HttpSession session) {		
<<<<<<< HEAD
		if (!usp.validaUser(user).isEmpty()) {			
			session.setAttribute("user", user.getNomuser());	
			session.setAttribute("iduser", usp.validaUser(user).get(0).values().toArray()[0]);
			//JOptionPane.showMessageDialog(null,  user.getEstado());
=======
		if (!usp.validaUser(user).isEmpty()) {
			session.setAttribute("user", user.getNomuser());
			session.setAttribute("iduser", usp.validaUser(user).get(0).values().toArray()[0]);
			//JOptionPane.showMessageDialog(null,  user.getIduser());
>>>>>>> c0d8f81ef07e15e91120717a4e7b611e09e2adec
			return "main";
		} else {
			return "index";
		}
	}

	@GetMapping("main/user")
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
