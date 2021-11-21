package application;

public class Aula_ForEach {

	public static void main(String[] args) {
		
		String[] nomes = new String[] {"Douglas", "Aline", "Amanda", "Leni", "Tais"};
		
		for (int i=0; i<nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("--------------------");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}
