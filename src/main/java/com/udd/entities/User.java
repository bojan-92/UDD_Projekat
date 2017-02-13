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

import org.hibernate.validator.constraints.Length;

import com.udd.enumerations.Role;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	@Size(max = 30)
	private String firstName;

	@NotNull
	@Size(max = 30)
	private String lastName;

	@NotNull
	@Size(max = 10)
	private String userName;

	@NotNull
	@Size(max = 10)
	private String userPassword;

	@NotNull
	@Size(max = 30)
	private Role type;
		
	@ManyToOne
	@JoinColumn(name = "user_category")
	private Category userCategory;

	public User() {
	}

	public User(int id, String firstName, String lastName, String userName, String userPassword, Role type) {
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

	public Role getType() {
		return type;
	}

	public void setType(Role type) {
		this.type = type;
	}

	public Category getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(Category userCategory) {
		this.userCategory = userCategory;
	}

	
}
