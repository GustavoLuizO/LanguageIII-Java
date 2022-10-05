package Models;

import java.util.ArrayList;

import Interfaces.IConnection;
import Interfaces.MySql;
import Interfaces.SqlServer;

public class Curso {
	private String Nome;
	private int CargaHoraria;
	private float Valor;
	private String Descricao;
	private int PublicoAlvoId;
	private IConnection Connection;
	
	public IConnection getConnection() {
		return Connection;
	}

	public void setConnection(IConnection connection) {
		Connection = connection;
	}
	
	public Curso(int opConnection) {
		if(opConnection == 1)
			Connection = new MySql();
		else 
			Connection = new SqlServer();
	}
	
	public Curso(String nome, int cargaHoraria, float valor, String descricao, int publicoAlvoId) {
		Nome = nome;
		CargaHoraria = cargaHoraria;
		Valor = valor;
		Descricao = descricao;
		PublicoAlvoId = publicoAlvoId;
	}

	public Curso(String nome, int cargaHoraria, float valor, String descricao, int publicoAlvoId, int opConnection) {
		Nome = nome;
		CargaHoraria = cargaHoraria;
		Valor = valor;
		Descricao = descricao;
		PublicoAlvoId = publicoAlvoId;
		if(opConnection == 1)
			Connection = new MySql();
		else 
			Connection = new SqlServer();
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}

	public float getValor() {
		return Valor;
	}

	public void setValor(float valor) {
		Valor = valor;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public int getPublicoAlvoId() {
		return PublicoAlvoId;
	}

	public void setPublicoAlvoId(int publicoAlvoId) {
		PublicoAlvoId = publicoAlvoId;
	}
	public void Cadastar(Curso curso) {
		Connection.Cadastrar(curso);
	}
	public ArrayList<Curso> ListarCursos() {
		ArrayList<Curso> cursos = Connection.Listar();
		return cursos;
	}
}
