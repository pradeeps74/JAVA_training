package com.training.exception;

public class Recruitment  { 
	public String candidateName;
	public int candidateAge;
	public Recruitment() {
		candidateName="Pradeep";
		candidateAge=23;
	}
	public Recruitment(int candidateAge) {
		this.candidateAge=candidateAge;
	}
	public void recruit() throws InvalidAgeException{
		if(candidateAge<21 || candidateAge>50)
		{
			throw new InvalidAgeException(candidateAge);
		}
		else
		{
			System.out.println("valid age");
		}
	}

}
