package homework5_1;

public class Policeman extends Employee {

	private String rank;
	
	public Policeman() {
		super();
	}
	
	public Policeman(int workHours, double salary, String rank) {
		super(workHours, salary);
		setRank(rank);
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void printRank() {
		System.out.println("Rank: " + getRank());
	}
}
