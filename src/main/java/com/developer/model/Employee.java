package com.developer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	
	//	Jpa Hibernate dependency will always look up for Schema . 
	// Gives "Table 'test.hibernate_sequence' doesn't exist" error .
	// To avoid that , GenerationType type is set to IDENTITY . 
	//But this works till Hibernate 4 version
	@Id
	@GeneratedValue
	private Long id;
	private String employeeName;
	private String employeeAddress;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String employeeName, String employeeAddress) {
		this.id = id;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

}
