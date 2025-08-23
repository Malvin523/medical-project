package org.example.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "patients")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "NID", unique = true)
    private String nid;
    @Column(name = "contact_info")
    private String contactInfo;
    @Column(name = "medical_history")
    private String medicalHistory;
    @OneToMany(mappedBy = "patient")
    private List<Payment> payments;
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;






}
