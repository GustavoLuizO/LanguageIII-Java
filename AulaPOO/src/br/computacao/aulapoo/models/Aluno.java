package br.computacao.aulapoo.models;

public class Aluno {
	private long Id;
	public Aluno(long id, String nome, Endereco endereco, Curso curso) {
		Id = id;
		Nome = nome;
		Endereco = endereco;
		Curso = curso;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Endereco getEndereco() {
		return Endereco;
	}
	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}
	public Curso getCurso() {
		return Curso;
	}
	public void setCurso(Curso curso) {
		Curso = curso;
	}
	private String Nome;
	private Endereco Endereco;
	private Curso Curso;
}
