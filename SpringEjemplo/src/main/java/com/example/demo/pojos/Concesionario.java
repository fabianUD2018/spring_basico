package com.example.demo.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Concesionario {

	@Id
	String id;
	@Column
	String nombre;
	@Column
	String direccion;
	@OneToMany
	@JoinColumn (name ="fk_id_conc")
	List<Modelo> listaModelos;
	
	/*public Concesionario() {
		// TODO Auto-generated constructor stub
	}*/
	public String getDireccion() {
		return direccion;
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
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Modelo> getListaModelos() {
		return listaModelos;
	}
	public void setListaModelos(List<Modelo> listaModelos) {
		this.listaModelos = listaModelos;
	}
	
	
}
