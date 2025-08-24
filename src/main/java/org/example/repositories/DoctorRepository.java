package org.example.repositories;

import org.example.entities.Doctor;
import org.example.enums.DoctorSpecialization;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DoctorRepository extends GenericRepository<Doctor, Long> {
    private final Session session;

    public DoctorRepository(Session session) {

        super(session, Doctor.class);
        this.session = session;
    }
    public List<Doctor> findByName(String name)
    {
        String query = "select d from Doctor d where d.firstName like :name";
        Query<Doctor> findQuery = session.createQuery(query,Doctor.class);
        findQuery.setParameter("name", "%" + name+"%");
        return  findQuery.getResultList();

    }

    public List<Doctor> findBylastName(String lastname) {
        String query = "select d from Doctor where d.lastName like :name";
        Query<Doctor> findQuery = session.createQuery(query, Doctor.class);
        findQuery.setParameter("name", "%"+lastname+"%");
        return findQuery.getResultList();
    }

    public List<Doctor> findBySpecialization(DoctorSpecialization specialization) {
        String query = "select d from Doctor where d.specialization = :specialization";
        Query<Doctor> findQuery = session.createQuery(query, Doctor.class);
        findQuery.setParameter("specialization",specialization);
        return findQuery.getResultList();



    }


}
