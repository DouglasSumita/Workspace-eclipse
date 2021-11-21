import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employeeNumber;
		int workedHours;
		double hourlyRate;
		double salary;
		
		employeeNumber = sc.nextInt();
		workedHours = sc.nextInt();
		hourlyRate = sc.nextDouble();
		
		salary = workedHours * hourlyRate;
		
		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();
	}
}
