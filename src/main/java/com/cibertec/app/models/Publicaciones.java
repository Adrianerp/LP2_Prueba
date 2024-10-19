package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="publicaciones")
public class Publicaciones {

	@Id
	@GeneratedValue
	private Integer publicaciones_id;
	@Column(name = "titulo", length = 45, nullable = false)
	private String titulo;
	@Column(name = "cuerpo", length = 45, nullable = false)
	private String cuerpo;
	@Column(name = "usuarios_id", nullable = false)
	private Integer usuarios_id;
	
	@ManyToOne
	@JoinColumn(name = "usuarios_id")
	private Usuarios usuarios;
	
	public Publicaciones() {
		
	}

	public Publicaciones(Integer publicaciones_id, String titulo, String cuerpo, Integer usuarios_id,
			Usuarios usuarios) {
		super();
		this.publicaciones_id = publicaciones_id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.usuarios_id = usuarios_id;
		this.usuarios = usuarios;
	}

	public Integer getPublicaciones_id() {
		return publicaciones_id;
	}

	public void setPublicaciones_id(Integer publicaciones_id) {
		this.publicaciones_id = publicaciones_id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Integer getUsuarios_id() {
		return usuarios_id;
	}

	public void setUsuarios_id(Integer usuarios_id) {
		this.usuarios_id = usuarios_id;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
