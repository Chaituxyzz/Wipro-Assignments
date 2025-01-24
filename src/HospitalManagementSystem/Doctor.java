package HospitalManagementSystem;

public class Doctor {
	
	 private int doctorId;
	    private String name;
	    private String specialization;

	    public Doctor(int doctorId, String name, String specialization) {
	        this.doctorId = doctorId;
	        this.name = name;
	        this.specialization = specialization;
	    }

	 
	    public String toString() {
	        return "Doctor[ID: " + doctorId + ", Name: " + name + ", Specialization: " + specialization + "]";
	    }

	    public int getDoctorId() {
	        return doctorId;
	    }

}
