package com.udd.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "files")
public class File {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String fileName;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "bookFile")
	private EBook bookFile;

	private String type;

	public File() {
	}

	public File(int id, String fileName, String type) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EBook getBookFile() {
		return bookFile;
	}

	public void setBookFile(EBook bookFile) {
		this.bookFile = bookFile;
	}

}
