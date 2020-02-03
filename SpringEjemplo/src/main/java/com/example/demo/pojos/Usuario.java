package com.example.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Column
	String fec_data;	
	@Id
	String id;
	@Column  
	String nombre	;
	@Column 
	String fk_id_modelo;
	
	
	
	
	
/*	public Usuario(String fec_data, String id, String nombre, String fk_id_modelo) {
		super();
		this.fec_data = fec_data;
		this.id = id;
		this.nombre = nombre;
		this.fk_id_modelo = fk_id_modelo;
	}*/
	public String getFec_data() {
		return fec_data;
	}
	public void setFec_data(String fec_data) {
		this.fec_data = fec_data;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFk_id_modelo() {
		return fk_id_modelo;
	}
	public void setFk_id_modelo(String fk_id_modelo) {
		this.fk_id_modelo = fk_id_modelo;
	}
	
	
	
}
