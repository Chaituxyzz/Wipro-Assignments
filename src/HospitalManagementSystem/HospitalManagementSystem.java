package HospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
	
	     List<Patient> patients = new ArrayList<>();
	     List<Doctor> doctors = new ArrayList<>();
	     List<Appointment> appointments = new ArrayList<>();

	    public void addPatient(int patientId, String name, int age) {
	        try {
	            Patient patient = new Patient(patientId, name, age);
	            patients.add(patient);
	            System.out.println("Patient added: " + patient);
	        } catch (Exception e) {
	            System.out.println("Error adding patient: " + e.getMessage());
	        }
	    }

	    public void addDoctor(int doctorId, String name, String specialization) {
	        try {
	            Doctor doctor = new Doctor(doctorId, name, specialization);
	            doctors.add(doctor);
	            System.out.println("Doctor added: " + doctor);
	        } catch (Exception e) {
	            System.out.println("Error adding doctor: " + e.getMessage());
	        }
	    }

	    public void scheduleAppointment(int appointmentId, int patientId, int doctorId, String date) {
	        try {
	            Patient patient = patients.stream().filter(p -> p.getPatientId() == patientId).findFirst().orElse(null);
	            Doctor doctor = doctors.stream().filter(d -> d.getDoctorId() == doctorId).findFirst().orElse(null);

	            if (patient == null) {
	                throw new Exception("Patient not found.");
	            }
	            if (doctor == null) {
	                throw new Exception("Doctor not found.");
	            }

	            Appointment appointment = new Appointment(appointmentId, patient, doctor, date);
	            appointments.add(appointment);
	            System.out.println("Appointment scheduled: " + appointment);
	        } catch (Exception e) {
	            System.out.println("Error scheduling appointment: " + e.getMessage());
	        }
	    }

	    public void showPatients() {
	        System.out.println("\nPatients List:");
	        for (Patient patient : patients) {
	            System.out.println(patient);
	        }
	    }

	    public void showDoctors() {
	        System.out.println("\nDoctors List:");
	        for (Doctor doctor : doctors) {
	            System.out.println(doctor);
	        }
	    }

	    public void showAppointments() {
	        System.out.println("\nAppointments List:");
	        for (Appointment appointment : appointments) {
	            System.out.println(appointment);
	        }
	   
	    
	    }
	
}


