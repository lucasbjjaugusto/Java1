package Exe_3;

import java.util.*;

public class Exe1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int senha;
		senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}
}
