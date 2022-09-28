package Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppExHashset {

	public static void main(String[] args) {
		Set<String> itens = new HashSet<>();
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de entradas : ");
		int qtd = ler.nextInt();
		ler.nextLine();
		
		for(int i = 0; i < qtd; i++) 
		{
			String entrada = ler.nextLine();
			if (!itens.contains(entrada))
				itens.add(entrada);
			
			System.out.println(itens.size());
		}
		
		ler.close();
	}
}
