package com.udd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	@Length(max = 30, message = "The field must be less than {max} characters")
	private String firstName;

	@NotNull
	@Length(max = 30, message = "The field must be less than {max} characters")
	private String lastName;

	@NotNull
	@Length(max = 10, message = "The field must be less than {max} characters")
	private String userName;

	@NotNull
	@Length(max = 10, message = "The field must be less than {max} characters")
	private String userPassword;

	@NotNull
	@Length(max = 30, message = "The field must be less than {max} characters")
	private String type;

	public User() {
	}

	public User(int id, String firstName, String lastName, String userName, String userPassword, String type) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.userPassword = userPassword;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
