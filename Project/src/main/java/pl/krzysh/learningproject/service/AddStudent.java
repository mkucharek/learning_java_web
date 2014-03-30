package pl.krzysh.learningproject.service;

import org.springframework.stereotype.Component;

@Component
public class AddStudent {

	private String firstName;
	private String surName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

}