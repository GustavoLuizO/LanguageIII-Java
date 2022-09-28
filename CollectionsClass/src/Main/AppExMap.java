package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppExMap {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Map<String, Integer> registroTelefonico = new HashMap<>();
		
		System.out.println("Quantidade de entrada : ");
		int qtd = ler.nextInt();
		ler.nextLine();
		
		for (int i = 0; i < qtd; i++) 
		{
			System.out.print("Entre com o nome : ");
			String nome = ler.nextLine();
			System.out.print("Entre com o número : ");
			int numero = ler.nextInt();
			ler.nextLine();
			
			registroTelefonico.put(nome, numero);
		}
		
		for (int j = 0; j < qtd; j++) {
			System.out.print("Consulte pelo nome : ");
			String consultNome = ler.nextLine();
			
			if (registroTelefonico.containsKey(consultNome))
				System.out.println(consultNome + " : " + registroTelefonico.get(consultNome));
			else 
				System.out.println("Not found !");
		}
		
		ler.close();

	}

}
