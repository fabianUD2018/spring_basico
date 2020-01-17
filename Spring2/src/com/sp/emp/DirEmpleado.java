package com.sp.emp;

public class DirEmpleado implements IEmpleados {

	private IInformes informe;
	private String nombre;
	private String email;
	
	public DirEmpleado(IInformes informe) {
		this.informe=informe;
	}
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Dire empleado";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informe.getInforme();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
