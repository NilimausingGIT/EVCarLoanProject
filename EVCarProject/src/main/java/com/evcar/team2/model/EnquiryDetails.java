package com.evcar.team2.model;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class EnquiryDetails {

	@Id
	private int eId;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private long mobileno;
	private String pancardNo;
	private int cibilscore;
	
	
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public int getCibilscore() {
		return cibilscore;
	}
	public void setCibilscore(int cibilscore) {
		this.cibilscore = cibilscore;
	}

	

}
