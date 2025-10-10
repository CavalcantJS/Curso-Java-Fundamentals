package dependenciainterfaceSistema;

abstract class Cadastro {

	protected String nome;
	protected int senha;
	protected double salario;
	
	public Cadastro(String nome, int Senha, double salario) {
		
		this.nome = nome;
		this.senha = senha;	
		this.salario = salario;
	}
}
