package banco;

public class Supervisor extends Funcionario implements InterfaceSistema{

Cadastro cadastro;
	
	public Supervisor(int registro, String cargo, double salario, Cadastro c) {
		
		super(registro,cargo, salario, c);
		this.cadastro =  c;
	}
	
	public void bonificacao() {
		
		System.out.println(super.salario*0.2);
		
	}
	
	
	
	@Override
	public void senha (int senha) {
		
		if (cadastro.senha == senha){
			
			System.out.println("Liberado");
			
		}else {
			
			System.out.println("Bloqueado");
			
		}
		
	}

	
}

