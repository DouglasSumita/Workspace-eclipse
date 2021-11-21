import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
         * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
         * ordem crescente ou decrescente.
		 */
		
		Scanner sc = new Scanner(System.in);
		int numberA, numberB;
		String description;
		
		numberA = sc.nextInt();
		numberB = sc.nextInt();
		
		if (numberA % numberB == 0 || numberB % numberA == 0) {
			description = "Sao Multiplos";
		} else {
			description = "Nao sao Multiplos";	
		}
		
		System.out.println(description);
		sc.close();
	}

}
