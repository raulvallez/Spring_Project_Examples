package com.privalia.annotations.aspectos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Principal {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = 
				new AnnotationConfigApplicationContext();
		annotationContext.scan("com.privalia.annotations.aspectos");
		annotationContext.refresh();
		

		Compra cp = (Compra) annotationContext.getBean(Compra.class);
		
		try {
			System.out.println("Invocamos sin problemas");
			cp.compra(false);
			System.out.println("Invocamos para que se produzca un error");
			cp.compra(true);
		} catch(Exception e) {
			System.out.println("Obtenemos la excepción " + e);
		}
		
		annotationContext.close();
	}

}
