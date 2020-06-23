package Exe_1;

import java.util.*;

public class Exe4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod;
		double hrt,hrv,sal;
		//
		cod = sc.nextInt();
		hrt = sc.nextDouble();
		hrv = sc.nextDouble();
		sal = hrt * hrv;
		//
		System.out.printf("Number %s ganha R$ %.2f reais%n",cod,sal);
		sc.close();
		}
}
