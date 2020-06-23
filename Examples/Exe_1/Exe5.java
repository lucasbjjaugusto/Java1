package Exe_1;

import java.util.*;

public class Exe5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peca,peca2,numPeca,numPeca2;
		double vlr,vlr2,total;
		
		//
		peca     = sc.nextInt();
		numPeca  = sc.nextInt();
		vlr		 = sc.nextDouble();
		peca2    = sc.nextInt();
		numPeca2 = sc.nextInt();
		vlr2     = sc.nextDouble();
		//
		total = (numPeca * vlr) + (numPeca2 * vlr2);
		System.out.println("Peça:"+ peca + " Peça2:" + peca2);
		System.out.printf("Valor a Pagar R$: %.2f",total);
		//
		sc.close();
	}
}
