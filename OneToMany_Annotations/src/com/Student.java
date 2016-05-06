package com;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="student",schema="onetomany")
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	private int studentId;
	private String studentName;
	private College college;
	

	public Student() {}

	@Id
	@GeneratedValue
	@Column(name="sId")
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	@Column(name="sName")
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@ManyToOne
	@JoinColumn(name="college_id")
	public College getCollege() {
		return college;
	}


	public void setCollege(College college) {
		this.college = college;
	}

	
}
