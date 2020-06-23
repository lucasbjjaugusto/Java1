package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class programAbstract {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		System.out.print("Informe o total dos pagadores do IR:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i+"º Pagador do IR:");
			System.out.print("Pessoa Fisica(F) ou Juridica(J)?");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Renda Anual:");
			Double rendaAnual = sc.nextDouble();
			if (tipo == 'F') {
				System.out.print("Valor gasto com Saude:");
				Double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}else {
				System.out.print("Numero de funcionarios:");
				int numFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		Double total = 0.0;
		System.out.println();
		System.out.println("Imposto Pago:");
		for (Pessoa pessoa : list) {
			System.out.println("Nome:"+pessoa.getNome()+" S:"+String.format("%.2f", pessoa.impostoPago()));
			total += pessoa.impostoPago();
		}
		System.out.println();
		System.out.println("Total Taxas:"+ String.format("%.2f", total));
		sc.close();
	}
}
