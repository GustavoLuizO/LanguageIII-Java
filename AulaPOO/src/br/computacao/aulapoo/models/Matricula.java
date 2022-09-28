package br.computacao.aulapoo.models;

public class Matricula {
	private Aluno Aluno;
	public Matricula(Aluno aluno, double nota, int frequencia, Turma turma) {
		Aluno = aluno;
		Nota = nota;
		Frequencia = frequencia;
		Turma = turma;
	}
	public Aluno getAluno() {
		return Aluno;
	}
	public void setAluno(Aluno aluno) {
		Aluno = aluno;
	}
	public double getNota() {
		return Nota;
	}
	public void setNota(double nota) {
		Nota = nota;
	}
	public int getFrequencia() {
		return Frequencia;
	}
	public void setFrequencia(int frequencia) {
		Frequencia = frequencia;
	}
	public Turma getTurma() {
		return Turma;
	}
	public void setTurma(Turma turma) {
		Turma = turma;
	}
	private double Nota;
	private int Frequencia;
	private Turma Turma;
}
