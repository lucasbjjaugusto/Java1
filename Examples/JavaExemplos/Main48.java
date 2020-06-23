package JavaExemplos;

import java.util.*;

public class Main48 {

	public static void main(String[] args) {
		/*for (int i = 4; i >= 0 ; i-- ) {
			System.out.println("Contagem:" + i);			
		}*/
		
		Scanner sc = new Scanner(System.in);
		int n;
		int soma = 0;
		n = sc.nextInt();
		//
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		 }
		 System.out.println("Soma:" + soma);
		//
		sc.close();
	}
}
