package HospitalManagementSystem;

public class Main {

	public static void main(String[] args) {
		
		       
	HospitalManagementSystem hms = new HospitalManagementSystem();

		       
		        hms.addPatient(1, "	Manohar", 30);
		        hms.addPatient(2, "Bhuvaneswar", 40);

		        
		        hms.addDoctor(1, "Dr. Ravi Kumar", "Cardiologist");
		        hms.addDoctor(2, "Dr. Appal Raju", "Dermatologist");

		        
		        hms.scheduleAppointment(1, 1, 1, "2025-01-25");
		        hms.scheduleAppointment(2, 2, 2, "2025-01-26");

		        
		        hms.showPatients();
		        hms.showDoctors();
		        hms.showAppointments();
		    }
		

	}


