import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
       
		/*
		 * Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o
		 * valor da �rea deste c�rculo com quatro casas decimais conforme exemplos.
		 * 
		 * F�rmula da �rea: area = PI . raio2 Considere o valor de PI = 3.14159
		 */
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double PI = 3.14159;
		double raio;
		double resultado;

		raio = sc.nextDouble();
		resultado = PI * Math.pow(raio, 2);
		System.out.printf("A = %.4f", resultado);
		sc.close();

	}
}
