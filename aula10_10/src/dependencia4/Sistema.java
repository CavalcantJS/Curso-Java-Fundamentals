package dependencia4;

public class Sistema {

	public void acessoSistema(AcessoInterface i,int senha) {
		
		i.acesso(senha);
		
	}


	public void acessoSistma(Gerente g, int senha) {
		
		g.acesso(senha);
	}
	
}