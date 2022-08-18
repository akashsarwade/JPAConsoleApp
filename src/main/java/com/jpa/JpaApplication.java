package com.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.dao.Student;
import com.jpa.repository.StudentRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(JpaApplication.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		  			//---------INSERT RECORD-------------------

		  Student student=new Student(); 
		  student.setStudentName("vaibhav Jain");
		  student.setStudentAddress("Ujjain");
		  student.setStudentCity("UP");
		  student.setStudentContact(78765432);
		  
		  Student student1=new Student(); 
		  student1.setStudentName("vicky Joshie");
		  student1.setStudentAddress("Peth"); 
		  student1.setStudentCity("Pune");
		  student1.setStudentContact(987654868);
		  
		  
		  Student student2=new Student();
		  student2.setStudentName("Priya Shinde");
		  student2.setStudentAddress("Nashik"); 
		  student2.setStudentCity("Nashik");
		  student2.setStudentContact(456776438);
		  
		  //Saving single User 
		  Student s1 =studentRepository.save(student); //
		  System.out.println(s1);
		  
		 // saving Multiple Users List<Student>
		  List<Student>students=List.of(student,student1,student2);//multiple objects
		  Iterable<Student>result=studentRepository.saveAll(students);
		  result.forEach(studen-> {
		  System.out.println(studen); });
		  System.out.println("saved data"+result);
		  
//		  
			/*
			 * Iterable<Student>itr=studentRepository.saveAll(student,student1,student2);
			 * Iterator<Student>iterator=itr.iterator(); while(iterator.hasNext()) { Student
			 * stud=iterator.next(); System.out.println(stud); }
			 */
		  
//		  
		  			//---------UPDATE RECORD-------------------

		// Update Student details
		
		  Optional<Student> optional = studentRepository.findById(12);
		  Student stud = optional.get(); 
		  stud.setStudentName("Akash Patil");
		  stud.setStudentAddress("Delhi");
		  stud.setStudentCity("Delhi");
		  stud.setStudentContact(87009870);
		  studentRepository.save(stud);
		 
		  
		   /*		  	---------READ RECORD-------------------
			* How to get data 3 way to get data 
			* 1.Iterator
			* 2.forEach loop 
			* 3.Lambda function
			* findById(id)-return optional containing data
			* 
 		   	*/		  
		  
			//	1.Get data using iterator
			Iterable<Student>itrble= studentRepository.findAll();
			Iterator<Student>itrtr=itrble.iterator();
		  	
			while(itrtr.hasNext()) {
			  Student studd=itrtr.next();
			  System.out.println(studd);
		  
		  	
		  	}
		  
			// 2. get Data Using Consumer Interface inn forEachLoop
		  	
			itrble.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				System.out.println(t);
			}
		});
		
		
		  //3 way to get data using labda function in forEachLoop
		  
			itrble.forEach(s->{
			  System.out.println(s);
		  });
		  
		  
		  
		  
				//---------DELETE RECORD-------------------
				///single data delete by id	
		  studentRepository.deleteById(20);
		  System.err.println("Delete successfully");
		  
		  //all data delete by using iterator
		  Iterable<Student>allStudents=studentRepository.findAll();
		  allStudents.forEach(std->{
			  System.err.println(std+"All Student Data Deleted Successfully");
		  });
				
		  studentRepository.deleteAll(allStudents);
		  
				
			
			
	}

}
