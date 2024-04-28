package com.crudusingjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.crudusingjpa.entities.Student;
import com.crudusingjpa.repository.StudentRepository;
import com.crudusingjpa.service.StudentServiceImp;



@ComponentScan
@EnableAutoConfiguration
@EntityScan("com.crudusingjpa.entities")
@Configuration
@EnableJpaRepositories("com.crudusingjpa.service")
@SpringBootApplication
public class CrudwithjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(CrudwithjpaApplication.class, args);
		
		StudentServiceImp studentServiceImp = context.getBean(StudentServiceImp.class);
		// To insert the Student object into the database. 
		//Student student = new Student();
		//student.setName("Abhishek");
		//student.setAddress("Indore");
		//studentServiceImp.save(student);
				
		// To Update the student object from database in this we only have to provide the id for the Student
		Student student = new Student();
		student.setName("Yuvraj");
		student.setAddress("Indore");
		student.setId(1);
		studentServiceImp.update(student);
		
		// To delete the student form the table
		
		studentServiceImp.deleteById(52);
		
		// To get Student by id
	}

}
