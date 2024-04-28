package com.crudusingjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudusingjpa.entities.Student;
import com.crudusingjpa.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) 
	{
		
		return studentRepository.save(student);
	
	}

	@Override
	public void deleteById(int id) 
	{
		
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student update(Student student) 
	{
		
		return studentRepository.save(student);
	}


	@Override
	public Student getByIdStudent(int id) {
		
		return studentRepository.findByIdStudent(id);
	}

}
