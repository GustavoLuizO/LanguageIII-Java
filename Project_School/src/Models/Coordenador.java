package Models;

public class Coordenador {
	private int Id;
	private String Nome;
	public Coordenador(int id, String nome, Models.Curso curso) {
		Id = id;
		Nome = nome;
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
	public Curso getCurso() {
		return Curso;
	}
	public void setCurso(Curso curso) {
		Curso = curso;
	}
	private Curso Curso;
	
}
