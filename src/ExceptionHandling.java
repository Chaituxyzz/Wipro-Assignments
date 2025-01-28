package Pratice;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		 System.out.println("Enter the numerator");
		Scanner S1= new Scanner(System.in);
		int numerator = S1.nextInt();
		
		 System.out.println("Enter the dinomerator");
			Scanner S2= new Scanner(System.in);
			int dinomerator = S2.nextInt();
			
			try {
				int result=numerator/dinomerator;
				System.out.println(result);
			}
			catch(ArithmeticException e) {
				if(dinomerator==0) {
					System.out.println("not disible bt zero");
				}
			}
			finally {
				System.out.println("exceution is completed");
			}
			
			
		S1.close();	
		S2.close();
	}
	

}
