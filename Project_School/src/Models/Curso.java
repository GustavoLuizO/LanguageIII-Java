package Models;

import java.util.List;

public class Curso {
	private int Id;
	public Curso(int id, String nome, List<Disciplina> disciplinas, Coordenador cordenador) {
		Id = id;
		Nome = nome;
		Disciplinas = disciplinas;
		Cordenador = cordenador;
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
	public Coordenador getCordenador() {
		return Cordenador;
	}
	public void setCordenador(Coordenador cordenador) {
		Cordenador = cordenador;
	}
	private String Nome;
	private List<Disciplina> Disciplinas;
	private Coordenador Cordenador; 
}
