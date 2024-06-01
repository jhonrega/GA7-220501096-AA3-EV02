package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.model.Empleado;

@Controller
public class EmpleadoController {
	
	//Captura de datos del formulario
	@GetMapping("/abrir")
	public String abrirE(Model modelo) {
		Empleado obj = new Empleado(); 
		modelo.addAttribute("empleado", obj);
		return "formulario";
	}
	
	// Enviar datos 
	@PostMapping("/registrar")
	public String registrar(Model modelo ,Empleado empleado) {
		modelo.addAttribute("a_nombre", empleado.getNombre());
		modelo.addAttribute("a_apellido", empleado.getApellido());
		modelo.addAttribute("a_nota", empleado.getNota());
		modelo.addAttribute("condicion", empleado.Condicion()); 
		return "formulario"; 
	}
	
}
