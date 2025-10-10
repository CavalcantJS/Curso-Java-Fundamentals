package dependencia4;

public class Tecnico extends Cadastro implements AcessoInterface{
	
	private String nome;
	private int senha;

	public Tecnico(String nome, int senha) {
		
		super(nome,senha);
		
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
