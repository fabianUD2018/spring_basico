package com.sp.javaconf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoConfJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IEmpleados e = new GerEmpleado();
		//e.getTareas();
		
		
		 
		 AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext (EmpleadosConfig.class);		
		EmpleadoJavaC miEmpleado = (EmpleadoJavaC)context.getBean(EmpleadoJavaC.class);
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
