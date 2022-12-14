package br.computacao.aulajpa.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Aluno {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Nome;
	private String Email;
	private String Enderešo;
	@Enumerated(EnumType.STRING)
	private Status Aluno;
	
	public Aluno(long id, String nome, String email, String enderešo, Status aluno) {
		Id = id;
		Nome = nome;
		Email = email;
		Enderešo = enderešo;
		Aluno = aluno;
	}
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getEnderešo() {
		return Enderešo;
	}
	public void setEnderešo(String enderešo) {
		Enderešo = enderešo;
	}
	public Status getAluno() {
		return Aluno;
	}
	public void setAluno(Status aluno) {
		Aluno = aluno;
	}
	
	
	
}
