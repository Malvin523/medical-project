package org.example.services;

import org.example.entities.Prescription;
import org.example.repositories.AppointmentRepository;
import org.example.repositories.PatientRepository;
import org.example.repositories.PrescriptionRepository;

import java.util.List;

public class PatientService {
    private final PatientRepository patientRepository;
    private final AppointmentRepository appointmentRepository;


    public PatientService(PatientRepository patientRepository, AppointmentRepository appointmentRepository) {
        this.patientRepository = patientRepository;
        this.appointmentRepository = appointmentRepository;
    }




}