package homework9_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

	private String name;
	private String lastName;
	private int id;
	private HashMap<String, ArrayList<Integer>> subjects;
	
	public Student() {}
	
	public Student(String name, String lastName, int id) {
		setName(name);
		setLastName(lastName);
		setId(id);
		subjects = new HashMap<String, ArrayList<Integer>>();
	}
	
	public Student(String name, String lastName, int id, HashMap<String, ArrayList<Integer>> subjects) {
		setName(name);
		setLastName(lastName);
		setId(id);
		setSubjects(subjects);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public HashMap<String, ArrayList<Integer>> getSubjects() {
		return subjects;
	}
	
	public void setSubjects(HashMap<String, ArrayList<Integer>> subjects) {
		this.subjects = subjects;
	}
	
	public void addSubjectMark(String subject, int mark) {
		ArrayList<Integer> marks = null;
		if (!subjects.containsKey(subject)) {
			System.out.println("No such subject found. A new subject will be added.");
			marks = new ArrayList<Integer>();
			marks.add(mark);
			subjects.put(subject, marks);
		} else {
			marks = subjects.get(subject);
			marks.add(mark);
			subjects.replace(subject, marks);
		}
	}
	
	public void removeSubject(String subject) {
		subjects.remove(subject);
	}
	
	public static double calculateAverageMark(String subject, Student[] students) {
		double avMark = 0;
		ArrayList<Integer> marks = new ArrayList<Integer>();
		for (Student student : students) {
			marks.addAll(student.subjects.get(subject));
		}
		for (Integer mark : marks) {
			avMark += mark;
		}
		return avMark / marks.size();
	}
}
