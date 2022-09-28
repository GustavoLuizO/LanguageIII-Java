package Dominio;

public class ItemVenda {
	private int Quantidade;
	
	public ItemVenda(int quantidade, EspecificacaoProduto produto) {
		Quantidade = quantidade;
		Produto = produto;
	}
	private EspecificacaoProduto Produto;
	
	public ItemVenda() {
		
	}
	
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public EspecificacaoProduto getProduto() {
		return Produto;
	}
	public void setProduto(EspecificacaoProduto produto) {
		Produto = produto;
	}
	public double subTotal() {
		return Produto.getPreco() * Quantidade;
	}
}
