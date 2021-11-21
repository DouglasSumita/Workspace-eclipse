package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio2 {

	public static void main(String[] args) {
		// Criar um programa que calcule a média do preço dos produtos digitados
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantity = sc.nextInt();
		Product[] products = new Product[quantity];
		double avg = 0.0;
		double totalProducts = 0.0;
		
		for (int i = 0; i < products.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			products[i] = new Product(name, price);
		}
		
		for (int i = 0; i < products.length; i++) {
			totalProducts += products[i].getPrice();
		}
		
		avg = totalProducts / products.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);
		sc.close();

	}

}
