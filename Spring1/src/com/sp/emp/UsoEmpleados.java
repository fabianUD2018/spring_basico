package com.sp.emp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.emp.IEmpleados;
public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEmpleados e = new GerEmpleado();
		e.getTareas();
		
		
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//IEmpleados miEmpleado = context.getBean(DirEmpleado.class);
		//IEmpleados miEmpleado = context.getBean(GerEmpleado.class);
		DirEmpleado miEmpleado = context.getBean(DirEmpleado.class); 
		System.out.println(miEmpleado.getTareas());
		System.out.println(miEmpleado.getInforme());
		System.out.println(miEmpleado.getNombre());
		System.out.println(miEmpleado.getEmail());
		context.close();
		
	}

}
