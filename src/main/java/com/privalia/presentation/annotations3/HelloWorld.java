package com.privalia.presentation.annotations3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld") //sería el nombre de la bean. Si mi componente que quiero inyector tiene un @Component pero no tiene value, por defecto me inyecta un objeto con el mismo nombre de la clase per con la primera letra enminúsculas
public class HelloWorld {

	
			// podenmos instanciar a travéx del set o del constructor
			//se puede usar lombok
		
		private String hello;
		
		
		public String getHello(){
			return hello;
		}
		
		/**
		 * 
		 * @param hello the hello to set
		 */
		public void setHello(String hello){
			this.hello = hello;
		}
		
		
		public HelloWorld() {

		}
		
		@Autowired
		public HelloWorld(@Value("Hello World from constructor...uooo!!!") String hello)
		{
			this.hello = hello;
		}
}
