package com.example.demo.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Modelo {

	@Id
	String id_modelo;
	@Column
	String nombre;
	@Column
	String costo;
	@Column
	String fk_id_conc ;
	@OneToMany
	@JoinColumn (name ="fk_id_modelo")
	List <Usuario> user;
	
	
	public String getId_modelo() {
		return id_modelo;
	}
	public void setId_modelo(String id_modelo) {
		this.id_modelo = id_modelo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public String getFk_id_conc() {
		return fk_id_conc;
	}
	public void setFk_id_conc(String fk_id_conc) {
		this.fk_id_conc = fk_id_conc;
	}
	
	
}
