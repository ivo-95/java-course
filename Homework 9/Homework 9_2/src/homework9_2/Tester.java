package homework9_2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		Student[] students = new Student[3];
		String name = null, lastName = null, subject = null;
		int id = 0, grade = 0;

		for (int i = 0; i < 3; i++) {
			System.out.format("Student %d first name: ", i + 1);
			name = sc.nextLine();
			System.out.format("Student %d last name: ", i + 1);
			lastName = sc.nextLine();
			System.out.format("Student %d ID: ", i + 1);
			id = sc.nextInt();
			students[i] = new Student(name, lastName, id);
			for (int j = 0; j < 5; j++) {
				System.out.format("Subject %d: ", j + 1);
				sc.nextLine();
				subject = sc.nextLine();
				for (int k = 0; k < 3; k++) {
					System.out.format(
							"Add grade for student \"%s, %s\", subject %s: ",
							lastName, name, subject);
					grade = sc.nextInt();
					students[i].addSubjectMark(subject, grade);
				}
			}
			sc.nextLine();
		}

		System.out.print("Average mark of subject: ");
		subject = sc.nextLine();
		System.out.format("Average mark for subject %s is %.2f\n", subject,
				Student.calculateAverageMark(subject, students));
		testPrint(students);
		sc.close();
	}
	
	public static void testPrint(Student[] students) {
		Scanner sc2 = new Scanner(System.in, "UTF-8");
		String subject = null;
		System.out.print("Average mark of subject: ");
		subject = sc2.nextLine();
		System.out.format("Average mark for subject %s is %.2f\n", subject,
				Student.calculateAverageMark(subject, students));
		testPrint(students);
		sc2.close();
	}
}
