import java.util.Scanner;

public class ExpressaoTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		System.out.println((age > 17) ? "Maior de Idade" : "Menor de idade");
		sc.close();
		

	}

}
