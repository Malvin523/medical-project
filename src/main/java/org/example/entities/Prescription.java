package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "prescription")
@Data
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;
    @Column(name = "prescription_date")
    private LocalDate prescriptionDate;
    @Column(name = "medicines")
    private String medicines;
}
