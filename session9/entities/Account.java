package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public void withdraw(double balance) {
		this.balance -= balance + 5.00;
	}
	
	public String toString() {
		return "Account Number: " + number + ", Holder:" + holder + ", Balance:" + String.format("%.2f",balance);
	}
	
}
