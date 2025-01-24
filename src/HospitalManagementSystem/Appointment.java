package HospitalManagementSystem;

public class Appointment {

	private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(int appointmentId, Patient patient, Doctor doctor, String date) {
    	
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    
    public String toString() {
        return "Appointment[ID: " + appointmentId + ", Patient: " + patient + ", Doctor: " + doctor + ", Date: " + date + "]";
    }
}


