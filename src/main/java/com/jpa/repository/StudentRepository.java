package com.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.dao.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	//custom method for find user
	
	public List<Student>findBystudentName(String studentName);
	
	//Iterable<Student> saveAll(Student student, Student student1, Student student2);

}
