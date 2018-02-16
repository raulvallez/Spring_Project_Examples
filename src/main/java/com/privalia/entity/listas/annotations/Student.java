package com.privalia.entity.listas.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import com.privalia.entity.listas.Teacher;

@Component(value = "david3Student")
@PropertySource("classpath:config.properties")  //le indico que busque el fichero de propiedades
public class Student {
	
	
	@Value("${student.idstudent}")
	private int idStudent;
	
	
	@Value("${student.name}")
	private String name;
	
	
	@Value("${student.surname}")
	private String surname;
	
	
	@Value("${student.age}")
	private int age;
	
	@Autowired //esta es la que ha de tener autowired para que detecte la clase address
	@Qualifier("teacher")
	@Value("#{'${student.list.teacher}.split(';')}") 
	private List<Teacher> listTeacher;
	
//	ojo! import lombok.*;   // El val no está, se tiene que configurar por eclipse
//	@Bean("teacherList")
//	private static List<Teacher> getTeacherList() {
//		val r=new LinkedList<Teacher>();
//		r.add(new Teacher(0,"PEPE"));
//		r.add(new Teacher(1,"Juan"));
//		return r;
//	}
	/**
	 * @return the idStudent
	 */
	public int getIdStudent() {
		return idStudent;
	}
	/**
	 * @param idStudent the idStudent to set
	 */
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	
	
	/**
	 * @return the listTeacher
	 */
	public List<Teacher> getListTeacher() {
		return listTeacher;
	}
	/**
	 * @param listTeacher the listTeacher to set
	 */
	public void setListTeacher(List<Teacher> listTeacher) {
		this.listTeacher = listTeacher;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [idStudent=");
		builder.append(idStudent);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", listTeacher=");
		builder.append(listTeacher.toString());
		builder.append("]");
		return builder.toString();
	}
	public Student() {
		
	}
	
	public Student(int idStudent, String name, String surname, int age, List<Teacher> listTeacher) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.listTeacher = listTeacher;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
