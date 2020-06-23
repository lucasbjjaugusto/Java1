package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramExPolimorf {

	public static void main(String[] args) {
		//Variaveis do mesmo tipo recebendo variaveis de tipos diferentes
		Account x = new BusinessAccount(1020,"Alex",1000.0,500.0);
		Account y = new SavingsAccount(1023,"Maria",1000.0,0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
