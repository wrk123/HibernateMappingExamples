package com;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name="college",schema="onetomany")
public class College implements Serializable {

	private static final long serialVersionUID = 1L;
	private int collgeId;
	private String collegeName;
	private List<Student> student;
	
	public College() {	}

	@Id
	@GeneratedValue
	@Column(name="college_id")
	public int getCollgeId() {
		return collgeId;
	}

	public void setCollgeId(int collgeId) {
		this.collgeId = collgeId;
	}

	@Column(name="college_name")
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	@OneToMany(targetEntity=Student.class,mappedBy="college",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	
    
	
}
