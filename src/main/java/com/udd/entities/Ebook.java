package com.udd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "ebooks")
public class Ebook {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull // proveriti koja polja su obavezna i samo za njiu ostaviti
				// @NotNull
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
	private String fileName;

	@NotNull
	@Size(max = 100)
	private String mime;

	public Ebook() {
	}

	public Ebook(int id, String title, String author, String keywords, int publicationYear, String fileName,
			String mime) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.keywords = keywords;
		this.publicationYear = publicationYear;
		this.fileName = fileName;
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

}
