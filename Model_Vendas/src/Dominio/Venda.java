package Dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {
	private LocalDate DataVenda;
	

	public Venda(LocalDate dataVenda, ArrayList<ItemVenda> vendas) {
		DataVenda = dataVenda;
		Vendas = vendas;
	}

	public LocalDate getDataVenda() {
		return DataVenda;
	}


	public void setDataVenda(LocalDate dataVenda) {
		DataVenda = dataVenda;
	}


	public ArrayList<ItemVenda> getVendas() {
		return Vendas;
	}


	public void setVendas(ArrayList<ItemVenda> vendas) {
		Vendas = vendas;
	}


	private ArrayList<ItemVenda> Vendas;
	
	
	public double Total() {
		double total = 0;
		for (ItemVenda itemVenda : Vendas) {
			total = total + itemVenda.subTotal();
		}
		
		return total;
	}
}
