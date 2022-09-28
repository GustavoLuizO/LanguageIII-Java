package Controlador;

import java.util.ArrayList;
import java.util.List;

import Dominio.EspecificacaoProduto;


public class EspecificacaoProdutoController {
	ArrayList<EspecificacaoProduto> ProdutosEspecificados = new ArrayList<EspecificacaoProduto>();
	
	public void CriarEspecificacaoProduto(String descricao, double preco) {
		EspecificacaoProduto ep = new EspecificacaoProduto(descricao, preco);
		ProdutosEspecificados.add(ep);
	}
	
	public String ReceberDescricaoProduto(int i) {
		return ProdutosEspecificados.get(i).getDescricao();
	}
	
	public Double ReceberValorProduto(int i) {
		return ProdutosEspecificados.get(i).getPreco();
	}
	
	public EspecificacaoProduto RetornarEspecificacaoProduto(int i) {
		return ProdutosEspecificados.get(i);
	}
}
