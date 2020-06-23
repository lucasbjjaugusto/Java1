package application;

import java.util.*;

import entities.Account;

public class programaAccount {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		//
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.nextLine().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		//
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		//
		System.out.println();
		System.out.print("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		//
		System.out.println();
		System.out.print("Enter withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		//
		sc.close();
	}
}
