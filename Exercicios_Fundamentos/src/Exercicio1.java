import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/* Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
           mensagem explicativa, conforme exemplos. */
		
		Scanner sc = new Scanner(System.in);
        int valorA;
        int valorB;
        
        valorA = sc.nextInt();
        valorB = sc.nextInt();
        
        System.out.printf("SOMA = %d", valorA + valorB );
		sc.close();
		
	}

}