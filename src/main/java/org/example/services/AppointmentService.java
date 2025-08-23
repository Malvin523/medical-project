package org.example.services;

import org.example.entities.Appointment;
import org.example.enums.AppointmentStatus;
import org.example.repositories.AppointmentRepository;
import org.example.repositories.DoctorRepository;
import org.example.repositories.PatientRepository;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
    private final Scanner scanner;


    public AppointmentService(AppointmentRepository appointmentRepository, PatientRepository patientRepository, DoctorRepository doctorRepository, Scanner scanner) {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
        this.scanner = scanner;
    }
    public Appointment createAppointment(String pourpose, LocalDateTime date, Long patientId, Long doctorId){
        Appointment appointment = new Appointment();
        appointment.setAppointmentStatus(AppointmentStatus.SCHEDULED);
        appointment.setAppointmentTime(date);
        appointment.setPourpose(pourpose);
        appointment.setPatient(patientRepository.findById(patientId));
        appointment.setDoctor(doctorRepository.findById(doctorId));
        return appointmentRepository.save(appointment);
    }




}
