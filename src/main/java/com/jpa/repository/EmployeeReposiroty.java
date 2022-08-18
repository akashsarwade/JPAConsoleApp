package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.dao.Employee;

public interface EmployeeReposiroty extends JpaRepository<Employee, Integer>{

}
