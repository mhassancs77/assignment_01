package com.example.demo.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.*;


public interface AppointmentService {

	public List<Appointment> getToDayAppointments(String toDayDate);
}
