import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o
        
		Scanner sc = new Scanner(System.in);
		int value;
		String description;
		
		value = sc.nextInt();
/*		
		
		if (value < 0) {
			description = "NEGATIVO";
		} else {
			description = "NAO NEGATIVO";
		}
*/
		description = (value < 0) ? "NEGATIVO" : "NAO NEGATIVO";
		System.out.println(description);
		sc.close();
	}

}
