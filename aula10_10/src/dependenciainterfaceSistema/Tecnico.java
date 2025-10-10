package dependenciainterfaceSistema;

public class Tecnico extends Cadastro implements AcessoInterface{
	
	private String nome;
	private int senha;
	

	public Tecnico(String nome, int senha, double salario) {
		
		super(nome,senha,salario);
		
	}
public void bonificacao() {
		
		System.out.println(super.salario * 0.2);
		
	}
	@Override
	
	public void acesso(int senha) {
		
		if(super.senha==senha) {
			
			System.out.println("liberado");
		}else {
			System.out.println("bloqueado");
		}
		
	}
	
	
}
