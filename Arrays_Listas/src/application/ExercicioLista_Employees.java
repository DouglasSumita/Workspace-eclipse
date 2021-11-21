package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercicioLista_Employees {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int quantityEmployees = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for (int i = 0; i < quantityEmployees; i++) {
			System.out.println();
			System.out.printf("Employee #%d:%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee employeeResult = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null); 
		
		if (employeeResult != null) {
		  	System.out.print("Enter the percentage: ");
		  	double percentage = sc.nextDouble();
		  	employeeResult.increaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		sc.close();

	}

}
