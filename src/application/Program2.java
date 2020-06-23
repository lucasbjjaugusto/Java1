package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program2 {
	public static void main(String[] args) {
		Account acc1 = new SavingsAccount(1001, "Elizeu", 100.00,0.1);
		acc1.withdraw(50.00);
		System.out.println("Conta:"+ acc1.getNumber() + " Saldo:" + acc1.getBalance());
		Account acc2 = new BusinessAccount(1002,"Jarlan",100.00,500.0);
		acc2.withdraw(50.00);
		System.out.println("Conta:"+ acc2.getNumber() + " Saldo:" + acc2.getBalance());
		Account acc3 = new BusinessAccount(1003, "Peyton", 1000.00, 2000.00);
		acc3.withdraw(200.00);
		System.out.println("Conta:"+ acc3.getNumber() + " Saldo:" + acc3.getBalance());
		/*Account acc = new Account(1001, "Elizeu", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Jarlan", 0.0, 500.00);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Peyton", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Ze", 0.0, 0.12);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.00);
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(500.00);
			System.out.println("Emprestimo");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("UPDATE");
		}*/
		
	}
}