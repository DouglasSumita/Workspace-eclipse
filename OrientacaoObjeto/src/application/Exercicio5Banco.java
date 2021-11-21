package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Exercicio5Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount accountA;
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accHolder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		double initialDeposit = 0;
		
		if (response == 'y') {
		   	System.out.print("Enter initial deposit value: ");
		   	initialDeposit = sc.nextDouble();
		   	accountA = new BankAccount(accNumber, accHolder, initialDeposit);
		} else {
			accountA = new BankAccount(accNumber, accHolder);
		}
		
		accountA = new BankAccount(accNumber, accHolder, initialDeposit);
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(accountA);
		
		System.out.printf("%nEnter a deposit value: ");
		accountA.deposit(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(accountA);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		accountA.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(accountA);
		
		sc.close();

	}

}