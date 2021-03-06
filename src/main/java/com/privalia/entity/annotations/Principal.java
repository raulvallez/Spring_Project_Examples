package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		AbstractApplicationContext context = 
//					new ClassPathXmlApplicationContext("spring-config.xml");
		
		
		AnnotationConfigApplicationContext annotationContext = 
				new AnnotationConfigApplicationContext();
		
		//escaneamos el paquete donde tengo las anotaciones
		annotationContext.scan("com.privalia.entity.annotations");
		annotationContext.refresh();

		Student student = annotationContext.getBean(Student.class);
		
		System.out.println(student.toString());
//		Student student = (Student) context.getBean("student");
//		
//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append(student.getIdStudent());
//		stringBuilder.append(" ");
//		stringBuilder.append(student.getName());
//		stringBuilder.append(" ");
//		stringBuilder.append(student.getSurname());
//		stringBuilder.append(" ");
//		stringBuilder.append(student.getAge());
//		stringBuilder.append(" ");
//		stringBuilder.append(student.getAddress().getIdAddress());
//		stringBuilder.append(" ");
//		stringBuilder.append(student.getAddress().getStreet());
//		
//		System.out.println(stringBuilder.toString());
		
//		Student studentConstructor = (Student) context.getBean("studentConstructor");
		
		annotationContext.close();
	}

}
