package application;

import java.util.*;

import util.CurrencyConverter;

public class exeEstatics {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("What is the dollar price?");
		double dolar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double amount = sc.nextDouble();
		//
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.convert(amount, dolar));
		//
		sc.close();
	}
}
