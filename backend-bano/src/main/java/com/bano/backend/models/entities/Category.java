package com.bano.backend.models.entities;

import java.io.Serializable;
import java.util.List;

//Todo javax.persistence es JPA
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Basic;
import javax.persistence.Column;


@Table(name="Categories")
@Entity
public class Category implements Serializable{
	
	/**
	 *Serializable ayuda para transformar un objeto de esta clase en bits 
	 *y transportarlo hacia el otro lado y que en el otro lado se lo vuelva a transformar de bits a objeto 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_category")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idCategory;
	
	@Column(name="name", length=35)
	private String name;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy="category", fetch= FetchType.LAZY)
	private List<Subject> subjects;
	
	public Category() {
		super();
	}

	public Category(Long id)
	{
		super();
		this.idCategory = id;
	}	
	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
