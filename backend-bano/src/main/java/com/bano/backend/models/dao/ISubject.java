package com.bano.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bano.backend.models.entities.Subject;

public interface ISubject extends CrudRepository<Subject, Long>{

}
