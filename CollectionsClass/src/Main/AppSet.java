package Main;

import java.util.HashSet;
import java.util.Set;

public class AppSet {

	public static void main(String[] args) {
		Set<String> itens = new HashSet<>();
		
		itens.add("Item 1");
		itens.add("Item 2");
		itens.add("Item 1");
		
		
		for (String item : itens) {
			System.out.println(item);
		}
	}
}
