package com.privalia.functional;

import org.springframework.context.annotation.Configuration;

@Configuration   //puedo hacerlo configuration o component, le pongo configuration así el test puedo inyectar la clase
public class Belly {
	private int cukes;
	
	public void eat(int cukes) {
		this.cukes = cukes;
	}
	
	public String getSound(int waitingTime) {
		if (cukes > 41 && waitingTime >=1) {
			return "growl";
		} else {
			return "silent";
		}
	}
}
