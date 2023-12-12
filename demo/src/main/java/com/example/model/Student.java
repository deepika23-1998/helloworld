package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="studentdata")
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stdId;
	@Column(name="stdFstname")  //only for table 
	private String stdFname;
	@Column(name="stdLstname")
	private String stdLname;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdFname() {
		return stdFname;
	}
	public void setStdFname(String stdFname) {
		this.stdFname = stdFname;
	}
	public String getStdLname() {
		return stdLname;
	}
	public void setStdLname(String stdLname) {
		this.stdLname = stdLname;
	}
	
	
	

}
