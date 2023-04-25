package ecerciciosFundamentos;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cidade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String exibirDados() {
		return "A pessoa de nome " + nome 
				+ " tem " + idade 
				+ " anos e mora na cidade de " + cidade + ".";
	}
}
