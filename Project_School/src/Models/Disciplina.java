package Models;

import java.util.List;

public class Disciplina {
	private int Id;
	public Disciplina(int id, String nome, List<Aluno> alunos, Models.Curso curso) {
		Id = id;
		Nome = nome;
		Alunos = alunos;
		Curso = curso;
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
	public List<Aluno> getAlunos() {
		return Alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		Alunos = alunos;
	}
	public Curso getCurso() {
		return Curso;
	}
	public void setCurso(Curso curso) {
		Curso = curso;
	}
	private String Nome;
	private List<Aluno> Alunos;
	private Curso Curso;
}
