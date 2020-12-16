package com.bano.backend.services.interfaces;

import java.util.List;

import com.bano.backend.models.entities.Student;

public interface IStudentService {

	public void save(Student s);//create-update
	
	public Student findById(Long id);//retrieve
	
	public void delete(Long id);//delete
	
	public List<Student> findAll();//list
}
