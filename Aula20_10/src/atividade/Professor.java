package atividade;

public class Professor extends Cadastro implements SenhaSistema{
	
	protected int senhaSistema;
	protected int senhaEscola;
	protected double salario;

	public Professor(String nome, int cpf, int telefone, String endereco, int senhaSistema,int senhaEscola, double salario) {
		super(nome, cpf, telefone, endereco);
		
		this.senhaSistema = senhaSistema;
		this.senhaEscola = senhaEscola;
		this.salario = salario;
	}
	
	@Override
	
	public void sistema(int senhaS) {
		
		if(this.senhaSistema==senhaS) {
			
			System.out.println("liberado");
		}else {
			System.out.println("bloqueado");
		}
	}


}
