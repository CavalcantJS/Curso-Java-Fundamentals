package dependenciainterfaceSistema;

public class Sistema {

	public void acessoSistema(AcessoInterface i,int senha) {
		
		i.acesso(senha);
		
	}


	public void bonificacao(AcessoInterface i) {
		
		i.bonificacao();
	}
	
}