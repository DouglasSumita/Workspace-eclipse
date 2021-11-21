import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla
		 * precis�o: A, B e C. Em seguida, calcule e mostre: 
		 * a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. 
		 * b) a �rea do c�rculo de raio C. (pi = 3.14159) 
		 * c) a �rea do trap�zio que tem A e B por bases e C por altura.
		 * d) a �rea do quadrado que tem lado B. 
		 * e) a �rea do ret�ngulo que tem lados A e B.
		 */
         
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, PI = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", a * c / 2);
		System.out.printf("CIRCULO: %.3f%n", Math.pow(c, 2) * PI);
		System.out.printf("TRAPEZIO: %.3f%n", (a + b) * c / 2 );
		System.out.printf("QUADRADO: %.3f%n", Math.pow(b, 2));
		System.out.printf("RETANGULO: %.3f%n", a * b );
		sc.close();
	}

}
