package Main;

import java.util.ArrayList;
import java.util.List;

public class AppList {

	public static void main(String[] args) {
		List<String> itens = new ArrayList<String>();
		
		for(int i = 0; i< 5; i++) {
			itens.add(i + " item");
		}
		
		System.out.println(itens.get(0));
		itens.remove(0);
		
		for (String item : itens) {
			System.out.println(item);
		}
		
		System.out.println(itens.size());
	}
}
