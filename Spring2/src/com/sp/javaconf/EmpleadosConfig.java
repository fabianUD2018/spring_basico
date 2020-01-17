package com.sp.javaconf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sp.emp.IEmpleados;
import com.sp.emp.IInformes;
import com.sp.emp.Informe;

@Configuration
@ComponentScan("com.sp.javaconf")

@PropertySource("classpath:datos.properties")
public class EmpleadosConfig {
	
	@Bean
	public IInformes informeConfJava() {
		return new InformeConfJava();
	}
	@Bean
	
	public IInformes informe() {
		return new Informe();
	}
	
	@Bean
	public IEmpleados empleadoJavaC() {
		return new EmpleadoJavaC();
	}
	
	

}
