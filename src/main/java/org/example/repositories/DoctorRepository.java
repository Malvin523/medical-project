package org.example.repositories;

import org.example.entities.Doctor;
import org.hibernate.Session;

public class DoctorRepository extends GenericRepository<Doctor, Long> {
    private final Session session;

    public DoctorRepository(Session session){
        super(session, Doctor.class);
        this.session = session;
    }
}
