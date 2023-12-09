package com.btln.online.login.services.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankingmovement", schema="public")
public class BankingMovement implements Serializable {

	private static final long serialVersionUID = -8034220785459790531L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "codemovement", length = 10)
	private String codeMovement;
	
	@Column(name = "typemovement", length = 1)
	private String typeMovement;
	
	@Column(name = "worth")
	private Double worth;
	
	@Column(name = "description")
	private String description;
	
	
	public BankingMovement() {
	}


	public BankingMovement(long id, String codeMovement, String typeMovement, Double worth, String description) {
		super();
		this.id = id;
		this.codeMovement = codeMovement;
		this.typeMovement = typeMovement;
		this.worth = worth;
		this.description = description;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCodeMovement() {
		return codeMovement;
	}


	public void setCodeMovement(String codeMovement) {
		this.codeMovement = codeMovement;
	}


	public String getTypeMovement() {
		return typeMovement;
	}


	public void setTypeMovement(String typeMovement) {
		this.typeMovement = typeMovement;
	}


	public Double getWorth() {
		return worth;
	}


	public void setWorth(Double worth) {
		this.worth = worth;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String toString() {
		return String.format("BankingMovement [codeMovement=%s, typeMovement=%s, worth=%s , description=%s]", codeMovement, typeMovement, worth, description);
	}

}
