import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		* seguir, calcule e mostre o valor da conta a pagar.
		* 
		* CODIGO ESPECIFICACAO      PREÇO
		* 1      CACHORRO QUENTE    R$ 4.00
		* 2      X-SALADA           R$ 4.50
		* 3      X-BACON            R$ 5.00
		* 4      TORRADA SIMPLES    R$ 2.00
		* 5      REFRIGERANTE       R$ 1.50
		*/
		
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double preco;
		double total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		switch (codigo) {
		case 1:
			preco = 4.00;
			break;
		case 2:
			preco = 4.50;
			break;
		case 3:
			preco = 5.00;
			break;
		case 4:
			preco = 2.00;
			break;
		case 5:
			preco = 1.50;
			break;
		default:
		   preco = 0;
		   break;
		}
		
		total = preco * quantidade;
		System.out.printf("Total: R$ %.2f", total);
		sc.close();

	}

}
