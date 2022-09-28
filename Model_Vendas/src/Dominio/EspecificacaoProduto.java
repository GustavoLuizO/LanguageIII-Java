package Dominio;

public class EspecificacaoProduto {
	private String Descricao;
	private Double Preco;
	
	public EspecificacaoProduto(String descricao, Double preco) {
		Descricao = descricao;
		Preco = preco;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double preco) {
		Preco = preco;
	}
}
