package app.netlify.sachin1008.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.netlify.sachin1008.Entity.Patient;
import app.netlify.sachin1008.Repository.PatientRepo;
import app.netlify.sachin1008.Utils.Messages;

@RestController
@RequestMapping("api/v1/")
public class PatientController {

	@Autowired
	private PatientRepo patientRepo;

	@PostMapping("save/patient")
	private ResponseEntity<Messages> savePatient(@RequestBody Patient patient) {
		Messages message = new Messages();

		if (patient == null) {
			message.setData(null);
			message.setMessage("patient is not null");
			message.setStatus("false");
			return ResponseEntity.badRequest().body(message);
		} else if (patient.getAge().trim().isEmpty()) {
			message.setData(null);
			message.setMessage("patient age is not null");
			message.setStatus("false");
			return ResponseEntity.badRequest().body(message);
		} else if (patient.getBlood().trim().isEmpty()) {
			message.setData(null);
			message.setMessage("patient blood group  is not null");
			message.setStatus("false");
			return ResponseEntity.badRequest().body(message);
		} else if (patient.getDose().trim().isEmpty()) {
			message.setData(null);
			message.setMessage("patient dose is not null");
			message.setStatus("false");
			return ResponseEntity.badRequest().body(message);
		} else if (patient.getFees().trim().isEmpty()) {
			message.setData(null);
			message.setMessage("patient fees is not null");
			message.setStatus("false");
			return ResponseEntity.badRequest().body(message);
		} else if (patient.getName().trim().isEmpty()) {
			message.setData(null);
			message.setMessage("patient name is not null");
			message.setStatus("false");
			return ResponseEntity.badRequest().body(message);
		} else if (patient.getPrescription().trim().isEmpty()) {
			message.setData(null);
			message.setMessage("patient prescription is not null");
			message.setStatus("false");
			return ResponseEntity.badRequest().body(message);
		} else if (patient.getUrgency().trim().isEmpty()) {
			message.setData(null);
			message.setMessage("patient urgency is not null");
			message.setStatus("false");
			return ResponseEntity.badRequest().body(message);
		} else {
			Patient p = patientRepo.save(patient);
			if (p == null) {
				message.setData(null);
				message.setMessage("Server side Error Can't save Patient");
				message.setStatus("false");
				return ResponseEntity.badRequest().body(message);
			} else {
				message.setData(patient);
				message.setMessage("Patient save successfully");
				message.setStatus("true");
				return ResponseEntity.ok().body(message);
			}

		}

	}

}
