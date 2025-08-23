package org.example.repositories;

import org.example.entities.Patient;
import org.hibernate.Session;

public class PatientRepository extends GenericRepository<Patient, Long>{
    private final Session session;

    public PatientRepository(Session session, Class<Patient> aClass) {
        super(session, Patient.class);
        this.session = session;
    }
}
