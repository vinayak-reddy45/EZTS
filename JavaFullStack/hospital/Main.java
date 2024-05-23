package hospital;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String n,g;
int ag;
boolean flag=true;
while(flag=true)
{
	
}
        System.out.println("Input Doctor Details:");
        Doctor doctor = Doctor.Doctor(scanner);

        System.out.println("\nInput Patient Details:");
        Patient patient = Patient.Patient(scanner);

        System.out.println("\nInput Nurse Details:");
        Nurse nurse = Nurse.inputNurseDetails(scanner);

        System.out.println("\nDoctor Details:");
        doctor.displayDoctorDetails();

        System.out.println("\nPatient Details:");
        patient.displayPatientDetails();

        System.out.println("\nNurse Details:");
        nurse.displayNurseDetails();

        scanner.close();
    }
}
