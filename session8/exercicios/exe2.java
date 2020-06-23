package exercicios;
/* Ler os dados de um funcionario (nome,salario bruto e imposto)
 * Mostrar os dados do funcionario
 * Aumuentar o salario com base em uma porcentagem dada(somente o bruto é afetado)
 * mostrar os dados novamente
 */

import java.util.*;

public class exe2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//
		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
		//
		sc.close();
	}
}
