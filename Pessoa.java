package projeto2;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexualidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexualidade() {
		return sexualidade;
	}
	public void setSexualidade(String sexualidade) {
		this.sexualidade = sexualidade;
	}
	
	
}
