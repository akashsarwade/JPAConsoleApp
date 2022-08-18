package com.jpa.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EmployeeDetails")
public class Employee {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "employeeId", nullable = false)
	private int eId;
	@Column(name = "employeeName", nullable = false)
	private String eName;
	@Column(name = "employeeAddress", nullable = false)
	private String eAddress;
	@Column(name = "employeeContact", nullable = false)
	private long eContact;
	@Column(name = "employeeSalary", nullable = false)
	private float eSalary;
	@Column(name = "employeeRole", nullable = false)
	private String eDesignation;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public long geteContact() {
		return eContact;
	}
	public void seteContact(long eContact) {
		this.eContact = eContact;
	}
	public float geteSalary() {
		return eSalary;
	}
	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", eContact=" + eContact
				+ ", eSalary=" + eSalary + ", eDesignation=" + eDesignation + "]";
	}
	public Employee(int eId, String eName, String eAddress, long eContact, float eSalary, String eDesignation) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAddress = eAddress;
		this.eContact = eContact;
		this.eSalary = eSalary;
		this.eDesignation = eDesignation;
	}
	
	public Employee() {
		super();
	}
	
	
	
	
	
}
