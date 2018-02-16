package com.privalia.aspectos;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx=
					new ClassPathXmlApplicationContext("spring-config.xml");
		
		Compra cp = (Compra) ctx.getBean("compra");
		
		try {
			System.out.println("Invocamos sin problemas");
			cp.compra(false);
			System.out.println("Invocamos para que se produzca un error");
			cp.compra(true);
		} catch(Exception e) {
			System.out.println("Obtenemos la excepción " + e);
		}
		
		ctx.close();
	}

}
