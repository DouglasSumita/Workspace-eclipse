package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Exercicio4Cotacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought? ");
		double totalDollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amount(totalDollars, price));
		sc.close();

	}

}
