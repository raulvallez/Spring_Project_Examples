package com.privalia.calculadora;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");

		ICalculator calculator = 
				(ICalculator) context.getBean(args[0]);
		
		System.out.println(calculator.operation(Integer.parseInt(args[1]), Integer.parseInt(args[2])));

		context.close();
	}

}
