package com.btln.online.login.services.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users", schema="public")
public class Users implements Serializable {

	private static final long serialVersionUID = -8034220785459790531L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "username", length = 250)
	private String username;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "mail")
	private String mail;
	
	
	
	public Users() {
	}
	


	public Users(String username, String name, String lastname, String mail) {
		this.username = username;
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
	}


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public String toString() {
		return String.format("User [username=%s, lastname=%s , mail=%s]", username, lastname, mail);
	}

}
