package com.bano.backend.services.implementations;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bano.backend.models.dao.ICategory;
import com.bano.backend.models.entities.Category;
import com.bano.backend.services.interfaces.ICategoryService;

@Service //se encarga de decir que todo esto es un componente de tipo servicio
public class CategoryService implements ICategoryService{

	@Autowired //inyección de dependencias, colocar un componente dentro de otro componente
	private ICategory dao;
	
	@Override
	@Transactional(readOnly=true)
	public Category findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Category> findAll() {
		return (List<Category>) dao.findAll();
	}

}
