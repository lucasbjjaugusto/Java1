package exercicios;

import java.util.*;

/* Programa ler os valores de largura e altura de um retangulo.
 * Depois mostrar o valor da sua area, perimetro e diagonal.
 * Usar uma classe como mostrado Rectangle
 */
public class exe1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//
		Rectangle rect = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		//
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER  = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL  = %.2f%n", rect.diagonal());
		sc.close();
	}
}
