package org.example.repositories;

import org.example.entities.Appointment;
import org.hibernate.Session;

public class AppointmentRepository extends GenericRepository<Appointment, Long>{
    private final Session session;


    public AppointmentRepository(Session session) {
        super(session, Appointment.class);
        this.session = session;
    }
}
