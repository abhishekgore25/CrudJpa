package com.crudusingjpa.service;

import com.crudusingjpa.entities.Student;


public interface StudentService{

	public Student save(Student student);
	
	public void deleteById(int id);
	
	public Student update(Student student);
	
	public Student getByIdStudent(int id);
}
