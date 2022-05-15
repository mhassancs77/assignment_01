package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {

	public Appointment() {

	}

	public Appointment(String appointPatientName, String appointDate, String appointStatus) {

		this.appointPatientName = appointPatientName;
		this.appointDate = appointDate;
		this.appointStatus = appointStatus;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appoint_id")
	int appointId;

	@Column(name = "appoint_patient_name")
	String appointPatientName;

	@Column(name = "appoint_date")
	String appointDate;

	@Column(name = "appoint_status")
	String appointStatus;

	public int getAppointId() {
		return appointId;
	}

	public void setAppointId(int appointId) {
		this.appointId = appointId;
	}


	

	public String getAppointPatientName() {
		return appointPatientName;
	}

	public void setAppointPatientName(String appointPatientName) {
		this.appointPatientName = appointPatientName;
	}

	public String getAppointDate() {
		return appointDate;
	}

	public void setAppointDate(String appointDate) {
		this.appointDate = appointDate;
	}

	public String getAppointStatus() {
		return appointStatus;
	}

	public void setAppointStatus(String appointStatus) {
		this.appointStatus = appointStatus;
	}

}
