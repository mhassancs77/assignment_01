package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.helper.Helper;
import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
public class AdminController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@RequestMapping("/")
	public String sayWelcome() {
		return "Welcome TO Clinc System";
	}
	
	
	@RequestMapping("/today-appointments")
	public List<Appointment> toDayAppointments() {
		return appointmentService.getToDayAppointments(Helper.getTodayDate());
	}
	

}
