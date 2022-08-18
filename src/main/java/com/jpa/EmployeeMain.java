package com.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.dao.Employee;
import com.jpa.repository.EmployeeReposiroty;

public class EmployeeMain {
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context=SpringApplication.run(JpaApplication.class, args);
		EmployeeReposiroty employeeReposiroty=context.getBean(EmployeeReposiroty.class);
		//Add Single User
		Employee emp=new Employee();
		emp.seteId(198);
		emp.seteName("Reshma");
		emp.seteAddress("Mumbai");
		emp.seteContact(987865467);
		emp.seteSalary(34993.8f);
		emp.seteDesignation("Software Tester");
		
		Employee e=employeeReposiroty.save(emp);
		System.out.println(e);
		System.out.println("Record Inserte Successfully");
		
		//Add Multiple Users at a time
		
		Employee emp1=new Employee();
		emp1.seteId(128);
		emp1.seteName("Vijay");
		emp1.seteAddress("Surat");
		emp1.seteContact(97865467);
		emp1.seteSalary(89777.8f);
		emp1.seteDesignation("Software Developer");
		
		Employee emp2=new Employee();
		emp2.seteId(238);
		emp2.seteName("Ram");
		emp2.seteAddress("Mumbai");
		emp2.seteContact(456865467);
		emp2.seteSalary(41993.8f);
		emp2.seteDesignation("Software Developer");
		
		Employee emp3=new Employee();
		emp3.seteId(618);
		emp3.seteName("Tushar");
		emp3.seteAddress("Punjab");
		emp3.seteContact(786543445);
		emp3.seteSalary(62887.8f);
		emp3.seteDesignation("Administrator");
		
		
		List<Employee>employees=List.of(emp1,emp2,emp3);
		
		Iterable<Employee>emps=employeeReposiroty.saveAll(employees);
		
		emps.forEach(es-> {
			System.out.println(es);
		});
		System.out.println("All Saved");
		
	
		
		
		System.out.println("-----UPDATE RECORD----------");
		
		
		Optional<Employee> optional = employeeReposiroty.findById(47);
		Employee e1=optional.get();
		e1.seteName("Raju");
		e1.seteAddress("Pune");
		e1.seteDesignation("Service Engineer");
		employeeReposiroty.save(e1);
		System.out.println("Data Upcdated Successfully");
		
		
		System.out.println("-----------DELETE RECORD-------------");
		
		employeeReposiroty.deleteById(198);
		System.err.println("Record Deleted Successfully..........!!!");
		
		Iterable<Employee>allDelete=employeeReposiroty.findAll();
		allDelete.forEach(del->{
			System.err.println(del+"All RECORD DELETED SUCCESSFULLY");
		});
		employeeReposiroty.deleteAll(allDelete);
			
		
		System.out.println("-----------READ RECORD-------------");

		Iterable<Employee>itrbl=employeeReposiroty.findAll();
		Iterator<Employee>itrte=itrbl.iterator();
		while(itrte.hasNext()) {
			Employee eee=itrte.next();
			System.out.println(eee);
		}
		
		
	}
	
	
}
