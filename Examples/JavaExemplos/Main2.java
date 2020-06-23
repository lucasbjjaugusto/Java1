package JavaExemplos;
import java.util.*;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom Dia");
		}
		else {
			if (hora < 18) {
				System.out.println("Boa Tarde");
			}
			else {
				System.out.println("Boa Noite");
			}
			
		}
		
		sc.close();
	}
}