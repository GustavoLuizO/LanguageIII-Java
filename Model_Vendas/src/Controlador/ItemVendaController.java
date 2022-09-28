package Controlador;

import java.util.ArrayList;

import Dominio.EspecificacaoProduto;
import Dominio.ItemVenda;

public class ItemVendaController {
	ArrayList<ItemVenda> ItensVendidos = new ArrayList<ItemVenda>();
	
	public void CriarItemVenda(int quantidade, EspecificacaoProduto Eproduto) {
		ItemVenda it = new ItemVenda(quantidade, Eproduto);
		ItensVendidos.add(it);
	}
	
	public ArrayList<ItemVenda> GetItensVendas(){
		return ItensVendidos;
	}
	
	public int QtdVendidos(int i) {
		return ItensVendidos.get(i).getQuantidade();
	}
	
	public double SubTotalVendido(int i) {
		ItemVenda it = new ItemVenda();
		return ItensVendidos.get(i).subTotal();
	}
}
