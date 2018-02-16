package com.privalia.annotations.aspectos;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidarMaterial {

	//Se ejecuta antes del método comprar
	@Before("execution( * com.privalia.aspectos.annotations.Comprar.compra(..) )")
	public void comprobarCantidad(){
		System.out.println("Se comproueba que es la cantidad compra");
	}
	
	//Se ejecuta después del método comprar
	@AfterReturning("execution( * com.privalia.aspectos.annotations.Comprar.compra(..) )")
	public void empaquetar() {
		System.out.println("Se empaqueta la mercancía");
	}
	
	//Se ejecuta si hay excepción en el método comprar
	@AfterThrowing("execution( * com.privalia.aspectos.annotations.Comprar.compra(..) )")
	public void ponerReclamacion() {
		System.out.println("Se reclaman los defectos detectados");
	}
}
