package com.mvcGitLead.dto;

public class PersonDto {

	private String name;
	private String lastName;
	private int userId;
	private String fathername;
	
	
	public PersonDto(String name, String lastName, int userId) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.userId = userId;
	}
	public PersonDto() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "PersonDto [name=" + name + ", lastName=" + lastName + ", userId=" + userId + "]";
	}
	
	
}
