package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nombre", length = 40, nullable = false)
	private String nombre;
	@Column(name = "apellido", length = 30, nullable = false)
	private String apellido;	
	
	public Empleado() {
		
	}

	public Empleado(Long codigo, String nombre, String apellido) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


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

	

}
