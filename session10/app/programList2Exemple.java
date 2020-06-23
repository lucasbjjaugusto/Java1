package app;

import java.util.*;

import entities.StudentsExemple;

public class programList2Exemple {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<StudentsExemple> list = new ArrayList<>();
		//
		System.out.print("Quantos Alunos estudam na MobralSchool?:");
		int numAlunos = sc.nextInt();
		//
		for (int i = 1; i <= numAlunos; i++) {
			System.out.println();
			System.out.print("Nome:");
			sc.nextLine();
			String nomeAluno = sc.nextLine();
			System.out.print("Serie:");
			int serieAluno = sc.nextInt();
			System.out.print("Prova1:");
			double nota1 = sc.nextDouble();
			System.out.print("Prova2:");
			double nota2 = sc.nextDouble();
			list.add(new StudentsExemple(nomeAluno, serieAluno, nota1, nota2));
		}
		//
		System.out.println("Lista de Alunos e Situação:");
		for (StudentsExemple alunos : list) {
			System.out.println(alunos);
		}
		//
		sc.close();
	}
}
