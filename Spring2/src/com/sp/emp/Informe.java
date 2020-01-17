package com.sp.emp;

import org.springframework.stereotype.Component;

@Component("informe")
public class Informe implements IInformes {

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "retorna informe";
	}

}
