package com.crudusingjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudusingjpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public Student findByIdStudent(int id);
}
