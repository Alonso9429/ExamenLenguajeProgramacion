package com.example.demo.model.controller;

import com.example.demo.model.Usuario;
import com.example.demo.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")

public class UsuarioController {

	private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping
	public String listarUsuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.listarUsuarios());
		return "usuarios";
	}
	
	@GetMapping("/nuevo")
	public String mostrarFormularioDeRegistro(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "formulario_usuario";
	}
	
	@PostMapping
	public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuarioService.guardarUsuario(usuario);
		return "redirect:/usuarios";
	}
}
