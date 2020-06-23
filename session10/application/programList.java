package application;

import java.util.*;
import java.util.stream.Collectors;

public class programList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//
		list.add("Peyton");
		list.add("Cida");
		list.add("Lucas");
		//
		list.add(2, "Jose");
		list.add(1, "Camila");
		//
		System.out.println("Quantos Nomes:"+list.size()); //Tamanho
		//
		for (String nome : list) { // for each passa o tipo, o apelido e a lista ou array
			System.out.println(nome);
		}
		System.out.println("##################");
		//
		//list.removeIf(x -> x.charAt(0) == 'C');
		//
		//for (String nome : list) {// for each passa o tipo, o apelido e a lista ou array
		//	System.out.println(nome);
		//}
		//System.out.println("##################");
		//
		//System.out.println("Index of Lucas:"+list.indexOf("Lucas"));
		//System.out.println("Index of Camila:"+list.indexOf("Camila"));//nao achou a posicao retorna -1
		//System.out.println("##################");
		//
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		//
		for (String nome : result) {// for each passa o tipo, o apelido e a lista ou array
			System.out.println(nome);
		}
		System.out.println("##################");
		//
		String name = list.stream().filter(x -> x.charAt(0) == 'c').findFirst().orElse("Nao Achou");
		System.out.println(name);
	}
}
