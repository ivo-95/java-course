package homework5_1;

public class Tester {

	public static void main(String[] args) {
		Policeman policeman = new Policeman(160, 800, "Deputy");
		Doctor doctor = new Doctor(200, 3000, 15, 7);
		
		System.out.println("Policeman:");
		policeman.printRank();
		policeman.printWorkHours();
		policeman.printSalary();
		
		System.out.println("\nDoctor:");
		doctor.printDayShifts();
		doctor.printNightShifts();
		doctor.printWorkHours();
		doctor.printSalary();
	}

}
