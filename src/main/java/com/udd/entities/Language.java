package com.udd.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "languages")
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	@Size(max = 30)
	private String name;

	@OneToMany(mappedBy = "bookLanguage", cascade = CascadeType.ALL)
	private Set<EBook> eBooks;

	public Language() {
	}

	public Language(int id, String name) {
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

	public Set<EBook> geteBooks() {
		return eBooks;
	}

	public void seteBooks(Set<EBook> eBooks) {
		this.eBooks = eBooks;
	}

}
