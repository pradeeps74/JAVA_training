package com.training.servlet;

import java.util.Arrays;

public class Person {
	private String firstName, lastName;
	private String[] hobbies;
	private String qualification;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public Person(String firstName, String lastName, String[] hobbies, String qualification) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.hobbies = hobbies;
		this.qualification = qualification;
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

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
