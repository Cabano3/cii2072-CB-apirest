package com.bano.backend.models.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public abstract class Person {
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="place_of_birth")
	private String placeofBirth;
	
	@Column(name="birth")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Calendar birth;
	
	@Column(name="number_card_Id")
	private String numberCardId;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="email")
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPlaceofBirth() {
		return placeofBirth;
	}

	public void setPlaceofBirth(String placeofBirth) {
		this.placeofBirth = placeofBirth;
	}

	public Calendar getBirth() {
		return birth;
	}

	public void setBirth(Calendar birth) {
		this.birth = birth;
	}

	public String getNumberCardId() {
		return numberCardId;
	}

	public void setNumberCardId(String numberCardId) {
		this.numberCardId = numberCardId;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

}
