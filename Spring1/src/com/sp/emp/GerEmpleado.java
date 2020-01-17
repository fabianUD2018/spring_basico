package com.sp.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class GerEmpleado implements IEmpleados {
	@Autowired
	@Qualifier("informeDos")
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

	public void setInforme(IInformes informe) {
		this.informe = informe;
	}
	//ejecutar tareas antes de que el bean este disponible
	
	//no necesariamente es void ni llamarse init
	public void init () {
		System.out.println("metodo init");
	}
	
	
	//depsues de que el bean a sido utilizado
	
	public void destroy () {
		System.out.println("Metodo destroy");
	}
}
