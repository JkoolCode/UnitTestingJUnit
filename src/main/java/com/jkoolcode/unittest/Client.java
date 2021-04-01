package com.jkoolcode.unittest;
import java.util.Objects;

public class Client {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	
	public Client(Integer id, String firstName, String lastName, Integer age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public boolean equals(Object other) {
		if(other == this) return true;
		
		if(!(other instanceof Client)) return false;
		
		Client otherClient = (Client) other;
		return Objects.equals(otherClient.id, this.id)
			&& Objects.equals(otherClient.firstName, this.firstName)
			&& Objects.equals(otherClient.lastName, this.lastName)
			&& Objects.equals(otherClient.age, this.age);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.lastName, this.age);
	}
}
