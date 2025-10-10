package dependenciainterfaceSistema;

public class TesteSupervisor {

	public static void main(String[]args) {
		
		Supervisor s1 = new Supervisor("Abel", 123, 10000);
		Supervisor s2 = new Supervisor("Beta", 456, 10000);
		Sistema si = new Sistema();
		Gerente g1 = new Gerente("Jonathan", 789, 20000);
		Tecnico t1 = new Tecnico("Giovane", 555, 6000);
		
		
		
		si.acessoSistema(s1, 123);
		si.acessoSistema(s2, 456);
		si.acessoSistema(g1, 789);
		si.acessoSistema(t1, 555);
		
		si.bonificacao(s1);
		si.bonificacao(s2);
		si.bonificacao(g1);
		si.bonificacao(t1);
		
	}
	
}
