package com.bano.backend.services.implementations;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bano.backend.models.dao.IStudent;
import com.bano.backend.models.entities.Student;
import com.bano.backend.services.interfaces.IStudentService;

@Service
public class StudentService implements IStudentService {

	
	@Autowired //inyección de dependencias, colocar un componente dentro de otro componente
	private IStudent dao;
	
	@Override
	@Transactional
	public void save(Student s) {
		// TODO Auto-generated method stub
		try {
			dao.save(s);
		}
		catch(Exception ex) {
			throw ex; 
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Student findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {

		try {
			dao.deleteById(id);
		}
		catch(Exception e) {
			throw e;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return (List<Student>) dao.findAll();
	}

}
