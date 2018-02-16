package com.privalia.entity.listas.annotations;

import org.springframework.stereotype.Component;

@Component(value = "teacher")
public class Teacher {

	private int idTeacher;
	private String name;
	
	
	/**
	 * @return the idTeacher
	 */
	public int getIdTeacher() {
		return idTeacher;
	}
	/**
	 * @param idTeacher the idTeacher to set
	 */
	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
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

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [idTeacher=");
		builder.append(idTeacher);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	public Teacher() {
		
	}
	
	public Teacher(int idTeacher, String name) {
		this.idTeacher = idTeacher;
		this.name = name;
	}

}
