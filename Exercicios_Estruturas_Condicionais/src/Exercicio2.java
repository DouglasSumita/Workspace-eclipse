import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Scanner sc = new Scanner(System.in);
		int value;
		String description;
		
		value = sc.nextInt();

		description = (value % 2 == 0) ? "PAR" : "IMPAR";
		System.out.println(description);
		sc.close();
	}

}
