package app.netlify.sachin1008.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.netlify.sachin1008.Entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long>{

}
