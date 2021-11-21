import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
         * come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
		 */
		
		Scanner sc = new Scanner(System.in);
		int startTime, endTime;
		int totalTime;
		
		startTime = sc.nextInt();
		endTime = sc.nextInt();
		
		if (startTime < endTime) {
			totalTime = endTime - startTime;
		} else {
			totalTime = 24 - startTime + endTime;	
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", totalTime);
		sc.close();

	}

}
