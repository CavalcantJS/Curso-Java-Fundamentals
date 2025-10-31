package banco;

public class Operador extends Funcionario implements InterfaceSistema{

	Cadastro cadastro;
	
	public Operador(int registro, String cargo, double salario, Cadastro c) {
		
		super(registro,cargo, salario, c);
		this.cadastro =  c;
		
	}
	
	public void bonificacao() {
		
		System.out.println(super.salario*0.1);
		
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

