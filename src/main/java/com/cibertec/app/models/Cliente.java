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
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_cliente;
	@Column(name="nombre", length = 40, nullable = false)
	private String nombre;
	@Column(name="apellido_Paterno", length = 30, nullable = false)
	private String apellido_Paterno;
	@Column(name="apellido_Materno", length = 40, nullable = false)
	private String apellido_Materno;
	@Column(name="documento", length = 8, nullable = false)
	private String documento;
	
	@ManyToOne
	@JoinColumn(name = "codigo_ciudad")
	private Ciudad ciudad;
	
	public Cliente() {
		
	}

	public Cliente(Integer codigo_cliente, String nombre, String apellido_Paterno, String apellido_Materno,
			String documento, Ciudad ciudad) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nombre = nombre;
		this.apellido_Paterno = apellido_Paterno;
		this.apellido_Materno = apellido_Materno;
		this.documento = documento;
		this.ciudad = ciudad;
	}

	public Integer getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Integer codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_Paterno() {
		return apellido_Paterno;
	}

	public void setApellido_Paterno(String apellido_Paterno) {
		this.apellido_Paterno = apellido_Paterno;
	}

	public String getApellido_Materno() {
		return apellido_Materno;
	}

	public void setApellido_Materno(String apellido_Materno) {
		this.apellido_Materno = apellido_Materno;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
}
