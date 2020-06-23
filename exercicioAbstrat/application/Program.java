package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		System.out.print("Enter the number of shapes:");
		int n = sc.nextInt();
		for (int i = 1; i<=n ;i++) {
			System.out.println("Shape #"+i+" data:");
			System.out.print("Rectangle or Circle(c/r)?");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED)");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width:");
				Double width = sc.nextDouble();
				System.out.print("Height:");
				Double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}else if (ch == 'c'){
				System.out.print("Radius:");
				Double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		System.out.println();
		for (Shape shape : list) {
			System.out.print("SHAPE AREAS");
			System.out.println(String.format("%.2f", shape.area()));
		}
		sc.close();
	}
}
