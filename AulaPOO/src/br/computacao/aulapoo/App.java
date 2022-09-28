package br.computacao.aulapoo;

import java.util.ArrayList;
import java.util.List;

import br.computacao.aulapoo.models.Aluno;
import br.computacao.aulapoo.models.Curso;
import br.computacao.aulapoo.models.Disciplina;
import br.computacao.aulapoo.models.Endereco;
import br.computacao.aulapoo.models.Professor;
import br.computacao.aulapoo.models.StatusAluno;
import br.computacao.aulapoo.models.Titulacao;

public class App {

	public static void main(String[] args) {
		
		Endereco endLucas = new Endereco(0, "Alameda dos eucaliptos", "8", "Centro");
		
		Professor celso = new Professor();
		Professor camila = new Professor();;
		
		Disciplina disciplina = new Disciplina(0, "Teoria da comput", celso);
		Disciplina disciplina2 = new Disciplina(0, "Sistemas embarcados", camila);
		List<Disciplina> listDisciplina = new ArrayList<Disciplina>();
		listDisciplina.add(disciplina2);
		listDisciplina.add(disciplina);
		
		
		celso = new Professor(0, "Celso", Titulacao.Doutor, listDisciplina);
		camila = new Professor(0, "Celso", Titulacao.Doutor, listDisciplina);
		
		Curso cursoComput = new Curso(0, "Ciencia da computacao", listDisciplina);
		
		Aluno a = new Aluno(0, "Gustavo",endLucas, cursoComput);
		Aluno a2 = new Aluno(1, "Lucas", endLucas, cursoComput);
		
		System.out.println(a.getNome());
		System.out.println(a.getEndereco().getRua());
		System.out.println(a.getCurso().getNome());
		
	}
}
