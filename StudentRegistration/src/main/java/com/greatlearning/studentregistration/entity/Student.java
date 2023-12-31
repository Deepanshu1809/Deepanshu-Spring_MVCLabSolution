package com.greatlearning.studentregistration.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "department")
	private String department;

	@Column(name = "country")
	private String country;

	// define constructors

	public Student() {

	}

	public Student(String name, String department, String country) {
		super();

		this.name = name;
		this.department = department;
		this.country = country;
	}

	// define getter/setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// define tostring
	@Override
	public String toString() {
		return "Student [student_id=" + id + ", name=" + name + ", department=" + department + ", country=" + country + "]";
	}

}
