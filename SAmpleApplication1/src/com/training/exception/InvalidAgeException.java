package com.training.exception;

public class InvalidAgeException extends Exception {
	private int age;

	public InvalidAgeException(int age) {
		this.age = age;
	}

	public String ShowMessage() {
		return "Invalid age: "+age;
	}
}
