package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Models.Curso;

public class MySql implements IConnection{
	Connection conn = null;
	PreparedStatement stm;
	ResultSet rs;

	@Override
	public void Cadastrar(Curso curso) {
		String sql = "INSERT INTO curso (Nome, Descricao, CargaHorario, PublicoAlvoId, Valor) VALUES (?, ?, ?, ?, ?)";
		
		Connection conn = AbrirConexao();
		
		try {
			stm = conn.prepareStatement(sql);
			
			stm.setString(1, curso.getNome());
			stm.setString(2, curso.getDescricao());
			stm.setInt(3, curso.getCargaHoraria());
			stm.setInt(4, curso.getPublicoAlvoId());
			stm.setFloat(5, curso.getValor());
			
			stm.execute();
			stm.close();
			
		FecharConexao(conn);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	@Override
	public Connection AbrirConexao() {
		conn = ConectarBD();
		return conn;
	}

	@Override
	public ArrayList<Curso> Listar() {
		ArrayList<Curso> Cursos = new ArrayList<Curso>(); 
		String sql = "Select * from curso"; 
		AbrirConexao();
		try {
			stm = conn.prepareStatement(sql);
			rs = stm.executeQuery();
			
			
			while(rs.next()) {
				Cursos.add(new Curso(rs.getString("Nome"), rs.getInt("CargaHorario"), rs.getFloat("Valor"), 
						rs.getString("Descricao"), rs.getInt("PublicoAlvoId")));
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		return Cursos;
	}

	@Override
	public void FecharConexao(Connection coon) {
		try {
			coon.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}

	@Override
	public Connection ConectarBD() {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/Curso?user=root&password=123456";
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return conn;
	}
}
