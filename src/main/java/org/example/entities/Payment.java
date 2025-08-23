package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "doctor")
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @Column(name = "payment_date")
    private LocalDate paymentDate;
    @Column(name = "amount")
    private double amount;
    @Column(name = "description")
    private String descroption;

}
