package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Table(name = "appointments")
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @Column(name = "appointment_time")
    private LocalTime appointmentTime;
    private String pourpose;



}
