package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Criar um programa que calcule a m�dia das alturas digitadas, utilizando vetor
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount of heights: ");
		int quantity = sc.nextInt();
		double[] heights = new double[quantity];
		double totalHeights = 0;
		
		for (int i = 0; i < quantity; i++) {
			heights[i] = sc.nextDouble();
			totalHeights += heights[i];
		}
		
		System.out.printf("AVERAGE HEIGHT = %.2f", totalHeights / quantity);
		sc.close();

	}
    
}
