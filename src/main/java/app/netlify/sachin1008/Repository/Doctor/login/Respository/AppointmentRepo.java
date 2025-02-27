package app.netlify.sachin1008.Repository.Doctor.login.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.netlify.sachin1008.Entity.doctor.login.Appoinment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appoinment, Long> {

}
