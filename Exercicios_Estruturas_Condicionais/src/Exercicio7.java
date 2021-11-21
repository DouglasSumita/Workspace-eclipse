import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
		 * qual pertence o ponto, ou se est� sobre um dos eixos cartesianos ou na origem
		 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem �Origem�. Se o
		 * ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a
		 * situa��o
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;
		String quadrante;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			quadrante = "Origem";
		} else if (x == 0.0) {
			quadrante = "Eixo X";
		} else if (y == 0.0) {
			quadrante = "Eixo Y";
		} else if (x < 0 && y < 0) {
			quadrante = "Q3";
		} else if (x < 0 && y > 0) {
			quadrante = "Q2";
		} else if (x > 0 && y > 0) {
			quadrante = "Q1";
		} else {
			quadrante = "Q4";
		}
		
		System.out.println(quadrante);
		sc.close();

	}

}
