package Exe_4;

import java.util.*;

public class Exe1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		//
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		//
		sc.close();
	}
}
