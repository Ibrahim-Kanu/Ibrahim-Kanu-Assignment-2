import java.util.Locale;
import java.util.Scanner;

public class PatientDriverApp {

	public static void main(String[] args) {
		
		String nameF = "Jenny";
		String nameM = "Elaine";
		String nameL = "Santori";
		String address = "123 Main Street";
		String city = "MyTown";
		String state = "CA";
		String zipCode = "01234";
		String phoneNumber = "777-555-1219";
		String emergencyContactName = "Bill Santori";
		String emergencyContactPhoneNumber = "777-555-1212";
		
		String procedure1 = "Physical Exam";
		String date1 = "7/20/2019";
		String practitioner1 = "Dr. Irvine";
		double charges1 = 3250;
		
		String procedure2 = "X-ray";
		String date2 = "7/20/2019";
		String practitioner2 = "Dr. Jamison";
		double charges2 = 5500.43;
		
		String procedure3 = "Blood test";
		String date3 = "7/20/2019";
		String practitioner3 =  "Dr. Smith";
		double charges3 =  1400.75;
		
		Scanner scan = new Scanner(System.in);
		
		//Commented due to uncertainty on whether or not code should accept input
		//System.out.println("Please enter your first name:"); 
		//nameF = scan.nextLine();
		//System.out.println("Please enter your middle name:"); 
		//nameM = scan.nextLine();
		//System.out.println("Please enter your last name:"); 
		//nameL = scan.nextLine();
		//System.out.println("Please enter your address:"); 
		//address = scan.nextLine();
		//System.out.println("Please enter your city:"); 
		//city = scan.nextLine();
		//System.out.println("Please enter your state:"); 
		//state = scan.nextLine();
		//System.out.println("Please enter your zipCode:"); 
		//zipCode = scan.nextLine();
		//System.out.println("Please enter your phone number:"); 
		//phoneNumber = scan.nextLine();
		//System.out.println("Please enter your emergemcy contact's name:"); 
		//emergencyContactName = scan.nextLine();
		//System.out.println("Please enter your emergency contact's phone number:"); 
		//emergencyContactPhoneNumber = scan.nextLine();
		
		//System.out.println("Please enter the first procedure:"); 
		//procedure1 = scan.nextLine();
		//System.out.println("Please enter the date on which it occured:"); 
		//date1 = scan.nextLine();
		//System.out.println("Please enter the name of the practitioner:"); 
		//practitioner1 = scan.nextLine();
		//System.out.println("Please enter how much you were charged:"); 
		//charges1 = scan.nextDouble();
		//scan.nextLine();
		
		//System.out.println("Please enter the first procedure:"); 
		//procedure2 = scan.nextLine();
		//System.out.println("Please enter the date on which it occured:"); 
		//date2 = scan.nextLine();
		//System.out.println("Please enter the name of the practitioner:"); 
		//practitioner2 = scan.nextLine();
		//System.out.println("Please enter how much you were charged:"); 
		//charges2 = scan.nextDouble();
		//scan.nextLine();
		
		//System.out.println("Please enter the first procedure:"); 
		//procedure3 = scan.nextLine();
		//System.out.println("Please enter the date on which it occured:"); 
		//date3 = scan.nextLine();
		//System.out.println("Please enter the name of the practitioner:"); 
		//practitioner3 = scan.nextLine();
		//System.out.println("Please enter how much you were charged:"); 
		//charges3 = scan.nextDouble();
		
		
		
		Patient p1 = new Patient(nameF, nameM, nameL);
		p1.setAddress(address);
		p1.setCity(city);
		p1.setState(state);
		p1.setZipCode(zipCode);
		p1.setEmergencyContactName(emergencyContactName);
		p1.setEmergencyContactPhoneNumber(emergencyContactPhoneNumber);
		
		Procedure pro1 = new Procedure(procedure1, date1, practitioner1, charges1);
		Procedure pro2 = new Procedure(procedure2, date2, practitioner2, charges2);
		Procedure pro3 = new Procedure(procedure3, date3, practitioner3, charges3);
		System.out.println("Patient info:");
		
		displayPatient(p1);
		displayProcedure(pro1, pro2, pro3);
		double total = calculateTotalCharges(pro1.getCharges(), pro2.getCharges(), pro3.getCharges());
		
		System.out.printf(Locale.US, "Total Charges: $%,.2f%n%n", total);
		System.out.println("Student Name: Ibrahim Kanu");
		System.out.println("MC#: M21169843");
		System.out.println("Due Date: 2/26/2024");
		

	}
	
	public static void displayPatient(Patient pt)
	{
		System.out.println(" Name: " + pt.buildFullName());
		System.out.println(" Address: " + pt.buildAddress());
		System.out.println(" Emergency Contact: " + pt.buildEmergencyContact());
	}
	
	public static void displayProcedure(Procedure no_1, Procedure no_2, Procedure no_3)
	{
		System.out.println("\n\tProcedure: " + no_1.getProcedure());
		System.out.println("\tProcedureDate=" + no_1.getDate());
		System.out.println("\tPractitioner=" + no_1.getPractitioner());
		System.out.println("\tCharge=" + no_1.getCharges());
		
		System.out.println("\n\tProcedure: " + no_2.getProcedure());
		System.out.println("\tProcedureDate=" + no_2.getDate());
		System.out.println("\tPractitioner=" + no_2.getPractitioner());
		System.out.println("\tCharge=" + no_2.getCharges());
		
		System.out.println("\n\tProcedure: " + no_3.getProcedure());
		System.out.println("\tProcedureDate=" + no_3.getDate());
		System.out.println("\tPractitioner=" + no_3.getPractitioner());
		System.out.println("\tCharge=" + no_3.getCharges() + "\n");
	
	
	}
	
	public static double calculateTotalCharges(double ch1, double ch2, double ch3)
	{
		double total = ch1+ ch2 + ch3;
		
		return total;
	}

}
