package com.java.DoctorHib;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	@Column(name="DoctorId")
	private String doctorid;
	
	@Column(name="DoctorName")
	private String doctorname;
	
	@Column(name="Specialization")
	private String specialization;
	
	@Column(name="Qualification")
	private String qualification;
	
	@Column(name="AvailableSlot")
	private String availableslot;

	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getAvailableslot() {
		return availableslot;
	}

	public void setAvailableslot(String availableslot) {
		this.availableslot = availableslot;
	}

	public Doctor(String doctorid, String doctorname, String specialization, String qualification,
			String availableslot) {
		super();
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.specialization = specialization;
		this.qualification = qualification;
		this.availableslot = availableslot;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
