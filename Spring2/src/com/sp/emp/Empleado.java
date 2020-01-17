
package com.sp.emp;
//no esta disponible en java 9
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//no esta dispobinle en java9 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("empleado")
public class Empleado implements IEmpleados{
	/*@Autowired
	@Qualifier("informe")*/
	private IInformes i ;
	@Autowired
	public Empleado(@Qualifier("informeTres") IInformes i) {
		this.i =i;
	}
	
	

	/*@Autowired
	@Qualifier("informe")
	public void setEmpleado(IInformes i) {
		
		this.i = i;
	}*/

	public String getTareas() {
		return "Empleado";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de empleado"+i.getInforme();
	}
	
	//spring no maneja el ciclo de vida completo cuuando se usa el prototype
	@PostConstruct 
	public void despuesDeCreado() {
		System.out.println("bean se a creado");
	}
	@PreDestroy 
	public void despuesDestruido() {
		System.out.println("bean se a destruido");
	}
	
}
