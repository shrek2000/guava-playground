package com.tikal.hangout.guava.hash;

import static java.util.Objects.hash;

import java.util.Objects;


public class User {
	private String firstName;
	private String lastName;
	private Integer age;

	public static final User createUser(String firstName, String lastName, Integer age){
		return new User( firstName,  lastName,  age);
	}
	
	public User(String firstName, String lastName, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	/**
	 * int is just 32 bit
	 * @see http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	 */
	public int hashCode() {

		return hash(firstName, lastName, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final User other = (User) obj;
		return Objects.equals(this.firstName, other.firstName)
				&& Objects.equals(this.lastName, other.lastName)
				&& Objects.equals(this.age, other.age);
	}

	@Override
	public String toString() {
		return com.google.common.base.Objects.toStringHelper(this)
				.add("firstName", firstName).add("lastName", lastName).add("age", age)
				.toString();
	}
	
	

}
