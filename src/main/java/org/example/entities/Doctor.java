package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "doctor")
@Data

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name ="firstName")
    private String firstName;
    @Column(name ="last_name")
    private String lastName;
    @Column(name = "contact_info")
    private String contactInfo;
    @Column(name ="start_work_at")
    private LocalTime StartWorkAt;
    @Column(name = "end_work_at")
    private LocalTime EndWorkAt;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

}
