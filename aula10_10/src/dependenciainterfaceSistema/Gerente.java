package dependenciainterfaceSistema;

public class Gerente extends Cadastro implements AcessoInterface{
	
	public Gerente(String nome, int senha, double salario) {
		
		super(nome,senha, salario);
		
	}
	
	public void bonificacao() {
		
		System.out.println(super.salario);
		
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
