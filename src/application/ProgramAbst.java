package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAbst {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Maria", 500.0,0.01));
		list.add(new BusinessAccount(1002, "Jarlan", 1000.0,400.0));
		list.add(new SavingsAccount(1003, "Elizeu", 300.0,0.01));
		list.add(new BusinessAccount(1004, "Horacio", 500.0,500.0));
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n", sum);
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.println("Updated balance for account:"+ acc.getBalance());
		}
	}
}
