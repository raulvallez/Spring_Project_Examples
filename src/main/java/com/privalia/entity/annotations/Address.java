package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "address")
@PropertySource("classpath:config.properties")
public class Address {

	
	private int idAddress;
	
	
	private String street;
	
	/**
	 * @return the idAddress
	 */
	public int getIdAddress() {
		return idAddress;
	}
	/**
	 * @param idAddress the idAddress to set
	 */
	@Autowired
	@Value("1")  //Se puede aplicar los valores en el setter
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * @param street the street to set
	 */
	@Autowired
	@Value("Calle Industria")
	public void setStreet(String street) {
		this.street = street;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [idAddress=");
		builder.append(idAddress);
		builder.append(", street=");
		builder.append(street);
		builder.append("]");
		return builder.toString();
	}
	
	public Address() {
		
	}
	
	public Address(int idAddress, String street){
		super();
		this.idAddress = idAddress;
		this.street = street;
	}
}
