package Models;

import java.util.List;

public class Aluno {
	private int Id;
	public Aluno(int id, String name, int matricula, List<Disciplina> disciplinas) {
		Id = id;
		Name = name;
		Matricula = matricula;
		Disciplinas = disciplinas;
	}
	private String Name; 
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	public List<Disciplina> getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}
	private int Matricula;
	private List<Disciplina> Disciplinas;
}
