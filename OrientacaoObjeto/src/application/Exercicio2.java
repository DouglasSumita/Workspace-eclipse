package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		double increasePercentage;
		
		System.out.printf("Name: " );
		employee.name = sc.nextLine();
		
		System.out.printf("%nGross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.printf("%nTax: ");
		employee.tax = sc.nextDouble();
	    
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		increasePercentage = sc.nextDouble();
		employee.increaseSalary(increasePercentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();

	}

}