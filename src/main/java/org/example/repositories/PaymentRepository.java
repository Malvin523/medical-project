package org.example.repositories;

import org.example.entities.Payment;
import org.example.entities.Prescription;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class PaymentRepository extends GenericRepository<Payment, Long>{
    private final Session session;

    public PaymentRepository(Session session) {
        super(session, Payment.class);
        this.session = session;
    }

    public List<Payment> findPaymentByPatient(Long id){
        String query = "select p from Payment p where p.patient.id = :patientId";
        Query<Payment> findQuery = session.createQuery(query, Payment.class);
        findQuery.setParameter("patientId", id);
        return findQuery.getResultList();
    }

}
