import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		  Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		  seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em
		  nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.
		*/
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		String intervalo;
		valor = sc.nextDouble();
		
		if (valor < 0 || valor > 100) {
			intervalo = "Fora de intervalo";
		} else if (valor <= 25.0) {
			intervalo = "Intervalo [0,25]";
		} else if (valor <= 50.0) {
			intervalo = "Intervalo [25,50]";
		} else if (valor <= 75.0) {
			intervalo = "Intervalo [50,75]";
		} else {
			intervalo = "Intervalo [75,100]";
		}
		
		System.out.println(intervalo);
		sc.close();
	}

}
