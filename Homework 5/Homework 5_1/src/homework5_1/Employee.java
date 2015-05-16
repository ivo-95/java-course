package homework5_1;

public abstract class Employee {

	private int workHours;
	private double salary;
	
	public Employee() {}
	
	public Employee(int workHours, double salary) {
		setWorkHours(workHours);
		setSalary(salary);
	}
	
	public int getWorkHours() {
		return workHours;
	}
	
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printWorkHours() {
		System.out.println("Work hours per month: " + getWorkHours());
	}
	
	public void printSalary() {
		System.out.println("Salary: " + getSalary());
	}
}
