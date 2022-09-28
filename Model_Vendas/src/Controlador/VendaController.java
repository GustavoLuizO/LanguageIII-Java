package Controlador;

import java.time.LocalDate;
import java.util.ArrayList;

import Dominio.ItemVenda;
import Dominio.Venda;

public class VendaController {
	Venda v;
	ArrayList<Venda> Vendas = new ArrayList<Venda>();
	public void CriarVenda(LocalDate dataVenda, ArrayList<ItemVenda> vendas) {
		v = new Venda(dataVenda, vendas);
		Vendas.add(v);
	}
	
	public double retornarTotal() {
		return v.Total();
	}
}
