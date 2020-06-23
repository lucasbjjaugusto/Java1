package application;

import java.util.*;
import java.util.Scanner;

import entities.Product9;

public class programProduct9 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product9 product = new Product9(name, price);
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		//
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		//
		System.out.println("Enther the number of products to be added in stock:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		//
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		//
		System.out.println("Enther the number of products to be added in stock:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		//
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		//
		sc.close();
	}
}
