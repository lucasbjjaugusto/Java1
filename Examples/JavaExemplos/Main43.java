package JavaExemplos;

import java.util.*;

/*
 * @author lucas.aoliveira
 * Aula 43 - While
 */
public class Main43 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0 ) {
			soma = soma + x;
			x = sc.nextInt();
			
		}
		System.out.println(soma);
		
		sc.close();
	}
}
