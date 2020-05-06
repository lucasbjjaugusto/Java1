package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ClientExe1;
import entities.OrderExe1;
import entities.OrderItemExe1;
import entities.ProductExe1;
import entities.enums.OrderStatusExe1;

public class ProgramExe1 {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//
		System.out.println("Enter client date:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("Birht Date(DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.nextLine());
		//
		ClientExe1 client = new ClientExe1(name, email, birthDate);
		//
		System.out.println("Enter order data:");
		System.out.print("Status:");
		String status = sc.nextLine();
		//
		OrderExe1 order = new OrderExe1(new Date(),OrderStatusExe1.valueOf(status),client);
		//
		System.out.print("How many itens to this order?");
		int n = sc.nextInt();
		for (int i =1; i<=n; i++) {
			System.out.println("Enter #"+ i +" the order data:");
			System.out.print("Product Name:");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Price:");
			double priceProduct = sc.nextDouble();
			//
			ProductExe1 product = new ProductExe1(productName, priceProduct); 
			//
			System.out.print("Quantity:");
			int quantity = sc.nextInt();
			//
			OrderItemExe1 orderItem = new OrderItemExe1(quantity, priceProduct, product);
			order.addItem(orderItem);
			//
		}
		//
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		//
		sc.close();
	}
}
