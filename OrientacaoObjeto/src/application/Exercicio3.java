package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.gradeA = sc.nextDouble();
		student.gradeB = sc.nextDouble();
		student.gradeC = sc.nextDouble();
		System.out.println(student);
		if (student.sucess()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.minimumGrade() - student.totalGrades());
		}
		sc.close();

	}

}
