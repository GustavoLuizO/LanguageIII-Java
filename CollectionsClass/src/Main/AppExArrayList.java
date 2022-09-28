package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppExArrayList {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<List<Integer>> listaGeral = new ArrayList<>();
		System.out.print("Quantidade de lista : ");
		int linhas = ler.nextInt();
		ler.nextLine();
		
		for (int i = 0; i < linhas; i++) 
		{
			int qtdValores = ler.nextInt();
			ler.nextLine();
			List<Integer> lista = new ArrayList<>();
			System.out.println("Entrada de valores : ");
			for (int j = 0; j < qtdValores; j++) 
			{
				System.out.print("Valor : ");
				int valor = ler.nextInt();
				ler.nextLine();
				lista.add(valor);
			}
			listaGeral.add(lista);
		}
		
		System.out.print("Quantidade de acessos na lista geral : ");
		linhas = ler.nextInt();
		for(int z = 0; z < linhas; z++) {
			System.out.print("Lista que será acessada : ");
			int listaAcesso = ler.nextInt();
			ler.nextLine();
			System.out.print("Qual posição da lista : ");
			int position = ler.nextInt();
			ler.nextLine();
			
			if (listaAcesso > listaGeral.size()) {
				System.out.println("Erro!!");
				continue;
			}
			
			if (position > listaGeral.get(listaAcesso).size()) {
				System.out.println("Error!!");
				continue;
			}
			
			System.out.println(listaGeral.get(listaAcesso).get(position));
		}
		ler.close();
	}

}
