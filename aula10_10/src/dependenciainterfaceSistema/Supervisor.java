package dependenciainterfaceSistema;

public class Supervisor extends Cadastro implements AcessoInterface {
	
	private String nome;
	private int senha;

	public Supervisor(String nome, int senha, double salario) {
		
		super(nome,senha, salario);
		
	}
	
	public void bonificacao() {
		
		System.out.println(super.salario * 0.4);
		
	}
	@Override
	public void acesso(int senha) {
		
		if(this.senha==senha) {
			
			System.out.println("liberado");
		}else {
			System.out.println("bloqueado");
		}
		
	}
	
	
}
