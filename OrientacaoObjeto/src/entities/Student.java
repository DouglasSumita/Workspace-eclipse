package entities;

public class Student {
    
	public String name;
	public double gradeA;
	public double gradeB;
	public double gradeC;
	
	public double minimumGrade() {
		return 60.00;
	}
	
	public double totalGrades() {
		return gradeA + gradeB + gradeC;
	}
	
	public boolean sucess() {
		return totalGrades() >= minimumGrade();
	}
	
	public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", totalGrades());
	}
}
