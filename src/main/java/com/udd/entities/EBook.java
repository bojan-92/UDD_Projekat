package com.udd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ebooks")
public class EBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Size(max = 80)
	private String title;

	@NotNull
	@Size(max = 120)
	private String author;
	
	@NotNull
	@Size(max = 120)
	private String keywords;
	
	@NotNull
	private int publicationYear;
	
	@NotNull
	@Size(max = 200)
	private String filename;
	
	@NotNull
	@Size(max = 100)
	private String mime;
	
	@ManyToOne
	@JoinColumn(name = "book_language")
	private Language bookLanguage;
	
	
	public EBook(){}

	public EBook(int id, String title, String author, String keywords, int publicationYear, String filename,
			String mime) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.keywords = keywords;
		this.publicationYear = publicationYear;
		this.filename = filename;
		this.mime = mime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public Language getBookLanguage() {
		return bookLanguage;
	}

	public void setBookLanguage(Language bookLanguage) {
		this.bookLanguage = bookLanguage;
	}
	
	
}
