package Models;

import IOrdenacao.Ordenacao;

public class Paciente {
	private Ordenacao o;
	private int Id;
	private String Nome;
	public Paciente(Ordenacao o, int id, String nome, Double[] temperaturasDuranteDia) {
		super();
		this.o = o;
		Id = id;
		Nome = nome;
		TemperaturasDuranteDia = temperaturasDuranteDia;
	}

	public Ordenacao getO() {
		return o;
	}

	public void setO(Ordenacao o) {
		this.o = o;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double[] getTemperaturasDuranteDia() {
		return TemperaturasDuranteDia;
	}

	public void setTemperaturasDuranteDia(Double[] temperaturasDuranteDia) {
		TemperaturasDuranteDia = temperaturasDuranteDia;
	}

	private Double[] TemperaturasDuranteDia = new Double[10];
	
	public void OrdenarTemperaturas() {
		o.MetodoOrdenacao(TemperaturasDuranteDia);
	}
}
