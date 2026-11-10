package com.suvam.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "First name is required")
    @Size(min = 4, message = "First name must be at least 4 characters")
	private String fName;
	
	@NotBlank(message = "Last name is required")
	private String lName;
	
	@NotBlank(message = "Email is required")
	@Email(message = "Email should be valid")
	private String email;
	
	@NotBlank(message = "Gender is required")
	private String gender;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	public Employee() {
	    
	}

	public Employee(long id, String fName, String lName, String email, String gender) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.gender = gender;
	}

	public Employee(long id, String fName, String lName, String email, String gender, LocalDate dateOfBirth) {
		this(id, fName, lName, email, gender);
		this.dateOfBirth = dateOfBirth;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
