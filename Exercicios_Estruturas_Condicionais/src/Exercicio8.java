import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
/*
		Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		
		RENDA                           IMPOSTO DE RENDA
		de 0.0 a R$ 2000.00             ISENTO
		de R$ 2000.01 até R$ 3000.00    8%
		de R$ 3000.01 até 4500.00       18%
		acima de R$ 4500.00             28%
		
		Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
        salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
        de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
        duas casas decimais.
		
*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario;
		double totalImposto = 0;
	    
		salario = sc.nextDouble();

		if (salario > 4500.00) {
			totalImposto += (salario - 4500.00) / 100 * 28;
			salario -= (salario - 4500.00);
		}
        
		if (salario >= 3000.01) {
			totalImposto += (salario - 3000.00) / 100 * 18;
			salario -= (salario - 3000.00);
		}
        
		if (salario >= 2000.01) {
			totalImposto += (salario - 2000.00) / 100 * 8;
			salario -= (salario - 2000.00);
		}
		
		if (totalImposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f", totalImposto);
		}
		
		sc.close();

	}

}
