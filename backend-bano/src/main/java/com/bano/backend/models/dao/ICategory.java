package com.bano.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bano.backend.models.entities.Category;

public interface ICategory extends CrudRepository<Category, Long>{

}
