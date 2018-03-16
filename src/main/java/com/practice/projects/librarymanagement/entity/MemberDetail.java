package com.practice.projects.librarymanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	private String name;
	private int age;
	private String emailAddress;
	private String phoneNumber;
	private String profession;
	private char gender;
	private String maritalStatus;

	@Override
	public String toString() {
		return this.getId() + this.getName() + this.getAge() + this.getEmailAddress() + this.getGender()
				+ this.getMaritalStatus() + this.getName() + this.getPhoneNumber() + this.getProfession();
	}

}
