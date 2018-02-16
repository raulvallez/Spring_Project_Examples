package com.privalia.presentation.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//El automáticamente ve que es una clase de configuración, la va a configurar, la va instanciar y la va a usar cuando la necesite

@Configuration
public class SpringConfiguration {  

	//Tengo el Bean con el nombre
	@Bean(name = "helloWorld")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
	
}
