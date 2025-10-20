package atividade;

public class Drive {

	public static void main(String[] args) {
		
		Professor p1 = new Professor("Jonathan", 1234567890 ,974818100, "Mogi", 123, 456, 5000);
		
		AcessoSistema as = new AcessoSistema();
		as.acessoSistema(p1);

	}

}
