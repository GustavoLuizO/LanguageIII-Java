package Models;

public class AlunoDisciplina {
	private Aluno Aluno;
	public AlunoDisciplina(Models.Aluno aluno, Models.Disciplina disciplina, float nota) {
		Aluno = aluno;
		Disciplina = disciplina;
		Nota = nota;
	}
	public Aluno getAluno() {
		return Aluno;
	}
	public void setAluno(Aluno aluno) {
		Aluno = aluno;
	}
	public Disciplina getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		Disciplina = disciplina;
	}
	public float getNota() {
		return Nota;
	}
	public void setNota(float nota) {
		Nota = nota;
	}
	private Disciplina Disciplina;
	private float Nota; 
}
