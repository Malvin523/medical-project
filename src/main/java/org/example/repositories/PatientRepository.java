package org.example.repositories;

import org.example.entities.Patient;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class PatientRepository extends GenericRepository<Patient, Long>{
    private final Session session;

    public PatientRepository(Session session, Class<Patient> aClass) {
        super(session, Patient.class);
        this.session = session;
    }


    public List<Patient> findByFirstName(String name){
        String query = "select p from Patient p where p.firstName like :name";
        Query<Patient> findQuery = session.createQuery(query, Patient.class);
        findQuery.setParameter("name", "%"+ name +"%");
        return findQuery.getResultList();
    }

    public List<Patient> findByLastName(String name){
        String query = "select p from Patient p where p.lastName like :name";
        Query<Patient> findQuery = session.createQuery(query, Patient.class);
        findQuery.setParameter("name", "%"+ name +"%");
        return findQuery.getResultList();
    }

    public Patient findByNid(String nid){
        String query = "select p from Patient p where p.nid = :nid";
        Query<Patient> findQuery = session.createQuery(query, Patient.class);
        findQuery.setParameter("name" , nid);
        return findQuery.getSingleResultOrNull();

    }


}
