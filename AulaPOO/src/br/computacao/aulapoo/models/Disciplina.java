package br.computacao.aulapoo.models;

public class Disciplina {
	private int Id;
	private String Nome;
	private Professor Professor;
	public Disciplina(int id, String nome, Professor professor) {
		Id = id;
		Nome = nome;
		Professor = professor;
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
	public Professor getProfessor() {
		return Professor;
	}
	public void setProfessor(Professor professor) {
		Professor = professor;
	}
}
