package Models;

public class Curso {
	private String Nome;
	private int CargaHoraria;
	private float Valor;
	private String Descricao;
	private int PublicoAlvoId;
	
	public Curso(String nome, int cargaHoraria, float valor, String descricao, int publicoAlvoId ) {
		Nome = nome;
		CargaHoraria = cargaHoraria;
		Valor = valor;
		Descricao = descricao;
		PublicoAlvoId = publicoAlvoId;
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
}
