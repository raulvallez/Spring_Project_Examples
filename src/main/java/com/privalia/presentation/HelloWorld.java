package com.privalia.presentation;

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
		
		
		public HelloWorld(String hello)
		{
			this.hello = hello;
		}
}
