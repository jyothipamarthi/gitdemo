package com.infy.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Employee {

	@NotNull
	@Min(value = 3)
	private int id;
	//@NotEmpty(message = "Name should not be empty")
	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "Name should contains only letters")
	private String name;
	// @DecimalMax(value = "3")
	private double salary;
	@Min(value = 1)
	@Max(value = 10)
	private Long phoneNumber;
	@Email(message = "{employee.email}")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
