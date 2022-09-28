package br.computacao.aulapoo.models;

import java.util.List;

public class Turma {
	private int Id;
	public Turma(int id, String anoSemestre, String nome, Disciplina disciplina,
			List<Matricula> matriculados) {
		Id = id;
		AnoSemestre = anoSemestre;
		Nome = nome;
		Disciplina = disciplina;
		Matriculados = matriculados;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAnoSemestre() {
		return AnoSemestre;
	}
	public void setAnoSemestre(String anoSemestre) {
		AnoSemestre = anoSemestre;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Disciplina getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		Disciplina = disciplina;
	}
	public List<Matricula> getMatriculados() {
		return Matriculados;
	}
	public void setMatriculados(List<Matricula> matriculados) {
		Matriculados = matriculados;
	}
	private String AnoSemestre;
	private String Nome;
	private Disciplina Disciplina;
	private List<Matricula> Matriculados;
}
