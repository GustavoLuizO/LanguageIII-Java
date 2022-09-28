package LerningConstrutores;

public class Pessoa {
	private String Nome;
	private int Idade;
	
	public Pessoa(String nome, int idade) {
		Nome = nome;
		Idade = idade;
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}
}
