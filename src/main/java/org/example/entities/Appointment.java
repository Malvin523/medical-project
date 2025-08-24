package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.example.enums.AppointmentStatus;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

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
    private LocalDateTime appointmentTime;
    private String pourpose;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AppointmentStatus appointmentStatus;
    @OneToMany(mappedBy = "appointment")
    private List<Prescription> prescriptions;



}
