package org.example.services;

import org.example.entities.Doctor;
import org.example.repositories.DoctorRepository;

import java.time.LocalTime;

public class DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor updateWorkSchegule(Long id, LocalTime start, LocalTime end){
        Doctor doctor = doctorRepository.findById(id);
        if (doctor == null) {
            throw new RuntimeException("Doctor with id " + id + " not found");
        }
        doctor.setStartWorkAt(start);
        doctor.setEndWorkAt(end);
        return doctorRepository.save(doctor);
    }



}
