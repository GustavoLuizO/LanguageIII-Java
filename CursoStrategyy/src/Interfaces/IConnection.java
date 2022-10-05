package Interfaces;

import java.sql.Connection;
import java.util.ArrayList;
import Models.Curso;

public interface IConnection {
	Connection AbrirConexao();
	void Cadastrar(Curso curso);
	ArrayList<Curso> Listar();
	void FecharConexao(Connection coon);
	Connection ConectarBD();
}
