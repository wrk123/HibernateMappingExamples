package com;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PersonDetails",schema="onetoone")
public class PersonDetails implements Serializable {

	private long personDetailsId;
	private String state;
	private String city;
	private String zipcode;
	//For oneToOne Bi-directional case 
	private Person person;
	
	@OneToOne(mappedBy="pDetails",cascade=CascadeType.ALL)
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	//end of one to one bi-directional mapping
	// The bi-directional mapping helps in fetching all records by querying either of the tables
	
	
	public PersonDetails() {	}

	@Id
	@GeneratedValue
	@Column(name="detailed_PK")
	public long getPersonDetailsId() {
		return personDetailsId;
	}

	public void setPersonDetailsId(long personDetailsId) {
		this.personDetailsId = personDetailsId;
	}

	@Column(name="state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name="city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name="zipCode")
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	
	
	
}
