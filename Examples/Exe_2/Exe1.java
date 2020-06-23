package Exe_2;

import java.util.*;

public class Exe1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1;
		val1 = sc.nextInt();
		if(val1 < 0 ) {
			System.out.println("Negativo");
		}
		else
			System.out.println("Positivo");
		sc.close();
	}
}
