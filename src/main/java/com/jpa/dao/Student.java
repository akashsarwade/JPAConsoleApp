package com.jpa.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetails")
public class Student {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "student_Id",nullable = false)
	private int studentId;
	
	@Column(name = "student_Name")
	private String studentName;
	
	@Column(name = "student_Address")
	private String studentAddress;	
	
	@Column(name = "student_City")
	private String studentCity;	
	
	@Column(name = "student_Contact")
	private long studentContact;
	

	public Student(int studentId, String studentName, String studentAddress, String studentCity, int studentContact) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentCity = studentCity;
		this.studentContact = studentContact;
	}
	public Student() {
		super();
	}
	

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public long getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(int studentContact) {
		this.studentContact = studentContact;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentCity=" + studentCity + ", studentContact=" + studentContact + "]";
	}
	
	
	
	

}
