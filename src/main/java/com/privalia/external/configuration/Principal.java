package com.privalia.external.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	private final static Logger slf4jLogger = LoggerFactory.getLogger(Principal.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Database database = (Database) context.getBean("database");
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(database.getUrl());
		stringBuilder.append(" ");
		stringBuilder.append(database.getUsername());
		stringBuilder.append(" ");
		stringBuilder.append(database.getPassword());
		
		slf4jLogger.info(stringBuilder.toString());
		
		context.close();
	}

}
