package com.privalia.builder;

//Builder

//Inner Classes
public class Employee {
		private Long id;
		private String name;
		private int gender;
		private String address;
		private String hobby;
		
		

		private Employee() {}
	
		//Una clase es estática cuando a nivel funcional, los miembros serán estaticos
		public static class EmployeeBuilder {
			private Long id;
			private String name;
			private int gender;
			private String address;
			private String hobby;	
		
		
			public EmployeeBuilder(Long id, String name) {
				this.id=id;
				this.name=name;
			}
			
			/**
			 * @return the id
			 */
			public Long getId() {
				return id;
			}

			/**
			 * @param id the id to set
			 */
			public void setId(Long id) {
				this.id = id;
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
			 * @return the gender
			 */
			public int getGender() {
				return gender;
			}

			/**
			 * @param gender the gender to set
			 */
			public void setGender(int gender) {
				this.gender = gender;
			}

			/**
			 * @return the address
			 */
			public String getAddress() {
				return address;
			}

			/**
			 * @param address the address to set
			 */
			public void setAddress(String address) {
				this.address = address;
			}

			/**
			 * @return the hobby
			 */
			public String getHobby() {
				return hobby;
			}

			/**
			 * @param hobby the hobby to set
			 */
			public void setHobby(String hobby) {
				this.hobby = hobby;
			}
			
			public Employee build() {
				Employee emp = new Employee();
				emp.id=id;
				emp.name=name;
				emp.gender=gender;
				emp.address=address;
				emp.hobby=hobby;
				return emp;
			}
			
			
			
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Employee [id=");
			builder.append(id);
			builder.append(", name=");
			builder.append(name);
			builder.append(", gender=");
			builder.append(gender);
			builder.append(", address=");
			builder.append(address);
			builder.append(", hobby=");
			builder.append(hobby);
			builder.append("]");
			return builder.toString();
		}
		
		//en class builder
//		@Override
//		public String toString() {
//			return "Employee [id=" + this.id + ", name=" + this.name + ", gender=" + this.gender + 
//					", address=" + this.address + ", hobby=" + this.address + "]";
//		}
		
		
		
}
