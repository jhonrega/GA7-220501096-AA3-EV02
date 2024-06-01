package com.springboot.model;

public class Empleado {
/* Atributos */
	private String nombre; 
	private String apellido; 
	private int nota;
	
	public Empleado() {
		super();
	}

	
	
	public Empleado(String nombre, String apellido, int nota) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
	}

	/* metodos get y set */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	// metodos 
	
	public String Condicion() {
		if(nota >= 4.5) {
			return "Aprobo"; 
		} 
		else {
			return "Desaprobado"; 
		}
	}
	
	
}
