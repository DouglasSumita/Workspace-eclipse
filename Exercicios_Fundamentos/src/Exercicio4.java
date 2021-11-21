import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
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
