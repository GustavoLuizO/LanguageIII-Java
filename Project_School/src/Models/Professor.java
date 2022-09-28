package Models;

import java.util.List;

public class Professor {
	private int Id;
	private String Nome; 
	public Professor(int id, String nome, List<Disciplina> disciplinas) {
		Id = id;
		Nome = nome;
		Disciplinas = disciplinas;
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
	public List<Disciplina> getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}
	private List<Disciplina> Disciplinas;
}
