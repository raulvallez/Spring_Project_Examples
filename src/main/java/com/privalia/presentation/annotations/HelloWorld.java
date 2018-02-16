package com.privalia.presentation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {

	
			// podenmos instanciar a travéx del set o del constructor
			//se puede usar lombok
		@Autowired
		@Value("Hello World From Annotations")
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
		
		
		public HelloWorld(String hello)
		{
			this.hello = hello;
		}
}
