package com.tr.modelClass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class EmpClass {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(length=15)
	private String name;
	@Column(length=15)
	private String surname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getId() {
		return id;
	}
	
}
