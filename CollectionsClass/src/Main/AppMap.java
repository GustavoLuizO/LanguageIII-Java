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
	}

}
