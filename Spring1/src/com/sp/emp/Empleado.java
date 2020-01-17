
package com.sp.emp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class Empleado implements IEmpleados{

	public String getTareas() {
		return "Empleado";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@PostConstruct 
	public void despuesDeCreado() {
		System.out.println("bean se a creado");
	}
	@PreDestroy 
	public void despuesDestruido() {
		System.out.println("bean se a destruido");
	}
}
