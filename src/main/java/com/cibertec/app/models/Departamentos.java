package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="departments")
public class Departamentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int department_id;
	@Column(name = "department_name", length = 30, nullable = false)
	private String department_name;
	@Column(name = "location_id", nullable = false)
	private int location_id;

	public Departamentos() {
		
	}

	public Departamentos(int department_id, String department_name, int location_id) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.location_id = location_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	
}
