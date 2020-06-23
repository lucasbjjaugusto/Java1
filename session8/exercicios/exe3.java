package exercicios;
/*Programa ler o nome de um aluno e as tres notas que ele teve nos 3 trimestres do ano
 *(primeiro trimestre vale 30 os outros 2 35 cada).
 * Mostrar a nota final do ano.
 * Mostrar se está aprovado ou nao, caso negativo quantos pontos faltam para ele obter
 * a nota minima
 */
import java.util.*;

public class exe3 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}
