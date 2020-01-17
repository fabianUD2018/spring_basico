package com.sp.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GerEmpleado implements IEmpleados {

	private IInformes informe;

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "GerEmpleado";
	}

	
	
	public String getInforme() {
		// TODO Auto-generated method stub
		return "ger "+ informe.getInforme();
	}

	@Autowired
	//puede tener cualquier nombre no necesariamente dbee usarse el nombre set
	@Qualifier("informeDos")
	public void setInforme(IInformes informe) {
		this.informe = informe;
	}

}
