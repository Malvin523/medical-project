    package org.example.repositories;

import org.example.entities.Appointment;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class AppointmentRepository extends GenericRepository<Appointment, Long>{
    private final Session session;


    public AppointmentRepository(Session session) {
        super(session, Appointment.class);
        this.session = session;
    }

    public List<Appointment> findAppointmentByPatient(Long id){
        String query = "Select a from Appointment a where a.patient.id = :patientId";
        Query<Appointment> findQuery = session.createQuery(query, Appointment.class);
        findQuery.setParameter("patientId",id);
        return  findQuery.getResultList();
    }

    public List<Appointment> findAppointmentByDoctor(Long id){
        String query = "Select a from Appointment a where a.doctor.id = :doctorId";
        Query<Appointment> findQuery = session.createQuery(query, Appointment.class);
        findQuery.setParameter("doctorId",id);
        return  findQuery.getResultList();
    }

}
