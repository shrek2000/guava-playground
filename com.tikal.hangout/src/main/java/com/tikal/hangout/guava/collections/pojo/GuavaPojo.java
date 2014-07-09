package com.tikal.hangout.guava.collections.pojo;

import java.util.Objects;

public class GuavaPojo {
	private String firstName;
	private String lastName;

	public GuavaPojo(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName); // java 7
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final GuavaPojo other = (GuavaPojo) obj;

		return Objects.equals(this.lastName, other.lastName)
				&& Objects.equals(this.firstName, other.firstName); // java 7
	}

	@Override
	public String toString() {
		return com.google.common.base.Objects.toStringHelper(this)
				.add("firstName", firstName).add("lastName", lastName)
				.toString();
	}

	public static void main(String[] args) {
		GuavaPojo first = new GuavaPojo("James", "Bond");
		GuavaPojo second = new GuavaPojo("Luk", "Skywalker");
		GuavaPojo third = new GuavaPojo("James", "Bond");
		System.out.println(first.toString());
		System.out.println("first.equals(second) " + first.equals(second));
		System.out.println("first.equals(third) " + first.equals(third));
		System.out.println("first.hashCode " + first.hashCode());
	}
}
