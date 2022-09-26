package View;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

import Interfaces.IConnection;
import Interfaces.MySql;
import Interfaces.SqlServer;
import Models.Curso;

public class App {
	static IConnection conn;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Curso curso = null;
		int opMenu = 0;
		
		InformarBancos();
		int op = ler.nextInt();
		ler.nextLine();
		if (op == 1)
			conn = new MySql();
		else 
			conn = new SqlServer();
		
		do {
			if(opMenu == 3)
			{
			op = ler.nextInt();
				ler.nextLine();
				if (op == 1)
					conn = new MySql();
				else 
					conn = new SqlServer();
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
					conn.Cadastrar(new Curso(nome, cargaHoraria, valor, descricao, opEscolherPublicoAlvo));
					System.out.println(nome + " cadastrado com sucesso...");
					break;
					
				case 2:
					ArrayList<Curso> cursos = conn.Listar();
					for (Curso item : cursos) {
						ListarCursos(item);
					}
					break;
					
				case 3:
					InformarBancos();
					break;
			}
		} while(op != 4);  
	}
	
	static void InformarBancos() {
		System.out.println("Informe o banco de dados que ser� utilizado : ");
		System.out.println("1 - MySql");
		System.out.println("2 - SqlServer");
		System.out.print("Op��o : ");
	}
	
	static void InformarOperacoes(int op) {
		if (op == 1) 
			System.out.println("Voc� selecionou MySql");
		else
			System.out.println("Voc� selecionou SqlServer");
		System.out.println("Informe a opera��o que deseja executar :");
		System.out.println("1 - Inserir um novo curso : ");
		System.out.println("2 - Visualizar os cursos cadastrados : ");
		System.out.println("3 - Alterar o banco de dados");
		System.out.print("Op��o : ");
	}
	
	static void EscolherPublicoAlvo() {
		System.out.println("Publico Alvo:");
		System.out.println("1 - Crian�a");
		System.out.println("2 - Adolescente ");
		System.out.println("3 - Adulto");
		System.out.println("4 - Idoso");
		System.out.print("Op��o : ");
	}
	
	/**
	 * @param curso
	 */
	static void ListarCursos(Curso curso) {
		String publicoAlvo = ListarPublicoAlvo(curso.getPublicoAlvoId());
		System.out.println("NomeCurso : " + curso.getNome() + " /Descricao : " + curso.getCargaHoraria() + " /Valor : " + curso.getValor() +
				" /PublicoAlvo : " + publicoAlvo + " /CargaHoraria : " + curso.getCargaHoraria() );
	}
	
	static String ListarPublicoAlvo(int id) {
		switch (id) {
		case 1:
			return "Crian�a";
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

