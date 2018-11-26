package pe.edu.upeu.jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upeu.jdbc.entity.Usuario;

@Controller
public class Homecontroller {
@RequestMapping("/")
public String index(Model model) {
	model.addAttribute("usuario", new Usuario());
	return "index";
}
public String home(Model model) {
	
	return "main";
}
}
