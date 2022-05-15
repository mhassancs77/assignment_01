package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	

	@Override
	public List<Appointment> getToDayAppointments(String toDayDate) {
		
		return appointmentRepository.findAll().stream().
				filter(p -> p.getAppointDate().equals(toDayDate))
				.toList();
	}

}
