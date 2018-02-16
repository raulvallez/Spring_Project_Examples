package com.privalia.aspectos;

public class ValidarMaterial {

	//Se ejecuta antes del método comprar
	public void comprobarCantidad(){
		System.out.println("Se comproueba que es la cantidad compra");
	}
	
	//Se ejecuta después del método comprar
	public void empaquetar() {
		System.out.println("Se empaqueta la mercancía");
	}
	
	//Se ejecuta si hay excepción en el método comprar
	public void ponerReclamacion() {
		System.out.println("Se reclaman los defectos detectados");
	}
}
