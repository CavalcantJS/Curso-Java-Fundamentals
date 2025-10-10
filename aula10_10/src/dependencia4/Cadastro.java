package dependencia4;

abstract class Cadastro {

	protected String nome;
	protected int senha;
	
	public Cadastro(String nome, int Senha) {
		
		this.nome = nome;
		this.senha = senha;
	}
}
