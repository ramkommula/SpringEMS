package com.employee.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	
	private String gender;
	private Date birthday;
	private String skill;
	
	public Employee() {
		
	}
	
		public Employee(long id, String firstname, String lastname, String email, String gender, Date birthday,
			String skill) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.skill = skill;
	}


	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}



	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

	
}



	





	
	
	
	

