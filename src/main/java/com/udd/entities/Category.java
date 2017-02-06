package com.udd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	@Length(max = 30, message = "The field must be less than {max} characters")
	private String name;

	public Category() {
	}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
