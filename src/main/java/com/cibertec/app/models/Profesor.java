package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cedula;
	@Column(name = "nombre", length = 40, nullable = false)
	private String nombre;
	@Column(name = "apellido", length = 40, nullable = false)
	private String apellido;
	@Column(name = "genero", length = 10, nullable = false)
	private String genero;

	@ManyToOne
	@JoinColumn(name = "cedula")
	private Mascotas mascotas;
	
	public Profesor() {
		
	}

	public Profesor(Integer cedula, String nombre, String apellido, String genero, Mascotas mascotas) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.mascotas = mascotas;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Mascotas getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascotas mascotas) {
		this.mascotas = mascotas;
	}
	
}
