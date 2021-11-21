import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
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
