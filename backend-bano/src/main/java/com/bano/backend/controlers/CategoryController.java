package com.bano.backend.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bano.backend.services.interfaces.ICategoryService;
import com.bano.backend.models.entities.Category;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	private ICategoryService service;
	
	@GetMapping("/category/{id}")
	private Category retrive(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("/category")
	public List<Category> list(){
		return service.findAll();
	}

}
