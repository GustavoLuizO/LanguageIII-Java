package Main;

import java.util.HashMap;
import java.util.Map;

public class AppMap {

	public static void main(String[] args) {
		Map<String, Double> carteira = new HashMap<>();
		
		carteira.put("GOLL4", 13.56);
		carteira.put("PETR4", 22.0);
		carteira.put("MGLU3", 2.20);
		
		
		System.out.println(carteira.get("MGLU3"));
		
		for (String key : carteira.keySet()) {
			System.out.println(key + " : " + carteira.get(key));
		}
		
		//map trabalha atraves de chave
		
		Map<String, String> map = new HashMap<>();
        map.put("Name", "Aman");
        map.put("Address", "Kolkata");
  
        // Print the map
        System.out.println("Map: " + map);
  
        // remap the values using compute() method
        map.compute("Name", (key, val)
                                -> val.concat(" Singh"));
        map.compute("Address", (key, val)
                                   -> val.concat(" West-Bengal"));
  
        // print new mapping
        System.out.println("New Map: " + map);
	}

}
