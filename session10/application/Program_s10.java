package application;

import java.util.*;
import entities.Product_s10;

public class Program_s10 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//
		int n = sc.nextInt();
		Product_s10[] vect = new Product_s10[n];
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product_s10(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		//
		sc.close();
	}
}
