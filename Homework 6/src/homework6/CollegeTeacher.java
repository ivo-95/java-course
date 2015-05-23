package homework6;

public class CollegeTeacher extends Teacher {
	
	private String college;

	public CollegeTeacher() {
		super();
	}
	
	public CollegeTeacher(String name, String lastName, int yearsOfWork, String college) {
		super(name, lastName, yearsOfWork);
		this.college = college;
	}
	
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}
