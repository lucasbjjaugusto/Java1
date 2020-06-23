package Exe_1;

import java.util.*;

public class Exe3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int v1,v2,v3,v4,result;
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		v3 = sc.nextInt();
		v4 = sc.nextInt();
		result = v1*v2 - v3*v4;
		
		System.out.println("Resultado:" + result);
		sc.close();
	}
}
