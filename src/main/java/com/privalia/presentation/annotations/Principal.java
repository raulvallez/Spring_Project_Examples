package com.privalia.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);

		HelloWorld helloWorld = 
				(HelloWorld)context.getBean("helloWorld");
		
		System.out.println(helloWorld.getHello());
		
//		HelloWorld helloWorldConst = 
//				(HelloWorld)context.getBean("HelloWorldConst");
//		
//		System.out.println(helloWorldConst.getHello());

		context.close();
	}
}