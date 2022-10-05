package View;

import java.util.Scanner;
import Models.Curso;

public class App {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Curso curso = null;
		int opMenu = 0;
		
		InformarBancos();
		int op = ler.nextInt();
		ler.nextLine();
		
		do {
			if(opMenu == 3)
			{
			op = ler.nextInt();
				ler.nextLine();
			}
			
			InformarOperacoes(op);
			opMenu = ler.nextInt();
			ler.nextLine();
			
			switch(opMenu) {
				
				case 1:
					System.out.print("Curso : ");
					String nome = ler.nextLine();
					System.out.print("Descricao : ");
					String descricao = ler.nextLine();
					System.out.print("Carga Horaria : ");
					int cargaHoraria = ler.nextInt();
					EscolherPublicoAlvo();
					int opEscolherPublicoAlvo = ler.nextInt();
					ler.nextLine();
					System.out.print("Valor : ");
					float valor = ler.nextFloat();
					ler.nextLine();
					curso = new Curso(nome, cargaHoraria, valor, descricao, opEscolherPublicoAlvo, op);
					curso.Cadastar(curso);
					System.out.println(nome + " cadastrado com sucesso...");
					break;
					
				case 2:
					Curso cursoList = new Curso(op);
					for (Curso item : cursoList.ListarCursos()) {
						ListarCursos(item);
					}
					break;
					
				case 3:
					InformarBancos();
					break;
			}
		} while(op != 4);  
		ler.close();
	}
	
	static void InformarBancos() {
		System.out.println("Informe o banco de dados que será utilizado : ");
		System.out.println("1 - MySql");
		System.out.println("2 - SqlServer");
		System.out.print("Opção : ");
	}
	
	static void InformarOperacoes(int op) {
		if (op == 1) 
			System.out.println("Você selecionou MySql");
		else
			System.out.println("Você selecionou SqlServer");
		System.out.println("Informe a operação que deseja executar :");
		System.out.println("1 - Inserir um novo curso : ");
		System.out.println("2 - Visualizar os cursos cadastrados : ");
		System.out.println("3 - Alterar o banco de dados");
		System.out.print("Opção : ");
	}
	
	static void EscolherPublicoAlvo() {
		System.out.println("Publico Alvo:");
		System.out.println("1 - Criança");
		System.out.println("2 - Adolescente ");
		System.out.println("3 - Adulto");
		System.out.println("4 - Idoso");
		System.out.print("Opção : ");
	}
	
	/**
	 * @param curso
	 */
	static void ListarCursos(Curso curso) {
		String publicoAlvo = ListarPublicoAlvo(curso.getPublicoAlvoId());
		System.out.println("NomeCurso : " + curso.getNome() + " /Descricao : " + curso.getDescricao() + " /Valor : " + curso.getValor() +
				" /PublicoAlvo : " + publicoAlvo + " /CargaHoraria : " + curso.getCargaHoraria() );
	}
	
	static String ListarPublicoAlvo(int id) {
		switch (id) {
		case 1:
			return "Criança";
		case 2:
			return "Adolescente";
		case 3:
			return "Adulto";
		case 4:
			return "Idoso";
		default:
			return"Unexpected value: " + id;
		}
	}
}

