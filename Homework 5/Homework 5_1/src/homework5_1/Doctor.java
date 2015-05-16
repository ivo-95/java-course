package homework5_1;

public class Doctor extends Employee {

	private int dayShifts;
	private int nightShifts;
	
	public Doctor() {
		super();
	}
	
	public Doctor(int workHours, double salary, int dayShifts, int nightShifts) {
		super(workHours, salary);
		setDayShifts(dayShifts);
		setNightShifts(nightShifts);
	}
	
	public int getDayShifts() {
		return dayShifts;
	}
	
	public void setDayShifts(int dayShifts) {
		this.dayShifts = dayShifts;
	}
	
	public int getNightShifts() {
		return nightShifts;
	}
	
	public void setNightShifts(int nightShifts) {
		this.nightShifts = nightShifts;
	}
	
	public void printDayShifts() {
		System.out.println("Day shifts per month: " + getDayShifts());
	}
	
	public void printNightShifts() {
		System.out.println("Night shifts per month: " + getNightShifts());
	}
}
