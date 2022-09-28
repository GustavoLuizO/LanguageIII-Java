package br.computacao.aulapoo.models;

public class Endereco {
	
	public Endereco(long id, String rua, String numero, String bairro) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	private long id;
	private String rua;
	private String numero;
	private String bairro;
}
