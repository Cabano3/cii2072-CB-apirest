package com.bano.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bano.backend.models.entities.Student;

public interface IStudent extends CrudRepository<Student, Long>{

	
}
