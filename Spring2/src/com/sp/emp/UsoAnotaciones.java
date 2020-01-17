package com.sp.emp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.emp.IEmpleados;
public class UsoAnotaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IEmpleados e = new GerEmpleado();
		//e.getTareas();
		
		
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado miEmpleado = (Empleado)context.getBean(Empleado.class);
		System.out.println(miEmpleado.getInforme());
		System.out.println(miEmpleado.getTareas());
	
		context.close();
		
		
		/*
		 *leer el class de confoguracion
		 *
		 AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext (EmpleadosConfig.class);
		 */
		
	}

}
