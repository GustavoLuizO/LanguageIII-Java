package br.computacao.aulapoo.models;

import java.util.List;

public class Professor {
	public Professor(long id, String nome, Titulacao titulacao, List<Disciplina> disciplinas) {
		
		this.id = id;
		this.nome = nome;
		this.titulacao = titulacao;
		this.disciplinas = disciplinas;
	}
	
	public Professor() {
		super();
	}

	private long id;
	private String nome;
	private Titulacao titulacao;
	private List<Disciplina> disciplinas;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Titulacao getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
}
