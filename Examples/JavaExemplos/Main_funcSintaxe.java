package JavaExemplos;

import java.util.*;

public class Main_funcSintaxe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("Informe tres numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//
		int maior = max(a, b, c);
		ShowResult(maior);
		//
		sc.close();
	}

	public static int max(int val1, int val2, int val3) {
		int aux;
		if (val1 > val2 && val1 > val3) {
			aux = val1;
		} else if (val2 > val3) {
			aux = val2;
		} else {
			aux = val3;
		}
		return aux;
	}

	public static void ShowResult(int valor) {
		System.out.println("Maior = " + valor);
	}

}
