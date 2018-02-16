package com.privalia.perfiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration	// es una clase de configuración
@Profile("dev") // le decimos que es entorno de dev
public class DevEnvConfig {
	@Bean
	public User user() {
		return new User(111,"Dev User");
	}
}
