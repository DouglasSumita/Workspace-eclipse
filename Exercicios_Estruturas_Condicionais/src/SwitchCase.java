import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberDay = sc.nextInt();
		String nameDay;

		switch (numberDay) {
		case 1:
			nameDay = "domingo";
			break;
		case 2:
			nameDay = "segunda";
			break;
		case 3:
			nameDay = "ter�a";
			break;
		case 4:
			nameDay = "quarta";
			break;
		case 5:
			nameDay = "quinta";
			break;
		case 6:
			nameDay = "sexta";
			break;
		case 7:
			nameDay = "sabado";
			break;
		default:
			nameDay = "valor inv�lido";
			break;
		}
        
		System.out.println("Dia da semana: " + nameDay);
		sc.close();

	}

}
