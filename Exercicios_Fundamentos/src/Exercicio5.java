import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
		 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
		 * o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int productA, productB, quantityProductA, quantityProductB;
		double valueProductA, valueProductB, amount;
		
		productA = sc.nextInt();
		quantityProductA = sc.nextInt();
		valueProductA = sc.nextDouble();
		
		productB = sc.nextInt();
		quantityProductB = sc.nextInt();
		valueProductB = sc.nextDouble();
		
		amount = (quantityProductA * valueProductA) + (quantityProductB * valueProductB);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", amount);
		
		sc.close();
	}

}
