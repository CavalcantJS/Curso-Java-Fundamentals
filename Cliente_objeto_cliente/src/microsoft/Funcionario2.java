package microsoft;

public class Funcionario2 {
	
	public String nome;
	public String CPF;
	public String telefone;

	
	public Funcionario2 (String CPF, String nome, String telefone) {
		this.CPF = CPF;
		this.nome = nome;
		this.telefone = telefone;
		
		
		System.out.println(nome + " - " + CPF +" - " + telefone);
	}
	
	
}
