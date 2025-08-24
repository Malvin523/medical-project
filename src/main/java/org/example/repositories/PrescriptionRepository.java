package org.example.repositories;

import org.example.entities.Appointment;
import org.example.entities.Prescription;
import org.hibernate.Session;

import org.hibernate.query.Query;
import java.util.List;

public class PrescriptionRepository extends GenericRepository<Prescription, Long> {
    private final Session session;

    public PrescriptionRepository(Session session) {
        super(session, Prescription.class);
        this.session = session;
    }


    public List<Prescription> findPrescriptionByPatient(Long id){
        String query = "select p from Prescription p where p.appointment.patient.id = :patientId";
        Query<Prescription> findQuery = session.createQuery(query, Prescription.class);
        findQuery.setParameter("patientId", id);
        return findQuery.getResultList();
    }

}
