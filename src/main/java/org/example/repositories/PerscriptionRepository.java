package org.example.repositories;

import org.example.entities.Prescription;
import org.hibernate.Session;

public class PerscriptionRepository extends GenericRepository<Prescription, Long> {
    private final Session session;

    public PerscriptionRepository(Session session) {
        super(session, Prescription.class);
        this.session = session;
    }



}
