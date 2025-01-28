package Practice;

public class ExceptionsThrow {
	
	static void age(int age) {
		 if(age<18) {
			 throw new IllegalArgumentException("Age is not valid");
		 }
		 System.out.println("Age is valid");
	 }

	public static void main(String[] args) {
        
		try {
		ExceptionsThrow.age(5);
	}
		catch (IllegalArgumentException e) {
			System.out.println("Exception caught " + e.getMessage());
		}

}
}
