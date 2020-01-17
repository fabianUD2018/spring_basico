
package com.sp.javaconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sp.emp.IEmpleados;
import com.sp.emp.IInformes;

//
public class EmpleadoJavaC implements IEmpleados{
	@Autowired
	@Qualifier("informeConfJava")

	private IInformes i;
	
	public String getTareas() {
		return "Empleado";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de empleado"+i.getInforme();
	}
	
	
}
