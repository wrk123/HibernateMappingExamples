package com;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="person",schema="onetoone")
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	private int personId;
	private String personName;
	private PersonDetails pDetails;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="pDetails_FK")
	public PersonDetails getpDetails() {
		return pDetails;
	}

	public void setpDetails(PersonDetails pDetails) {
		this.pDetails = pDetails;
	}

	public Person() {}

	@Id
	@GeneratedValue
	@Column(name="pId")
	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}

	@Column(name="pName")
	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}

	
}
