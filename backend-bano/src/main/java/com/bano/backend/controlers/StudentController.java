package com.bano.backend.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bano.backend.models.entities.Student;
import com.bano.backend.services.interfaces.IStudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private IStudentService service;
	
	@GetMapping("/student/{id}")
	private Student retrive(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("/student")
	public List<Student> list(){
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Student create(@RequestBody Student student) {
		service.save(student);
		return student;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Student update(@RequestBody Student student, @PathVariable Long id) {
		service.save(student);
		return student;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
