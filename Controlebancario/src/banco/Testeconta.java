package banco;

public class Testeconta {

	public static void main(String[] args) {
		
		Cliente cli01 = new Cliente("Jonathan", "123.456.789-10", "(11)97481-8100");
		Cliente cli02 = new Cliente("Giovane", "987.654.321-10", "(11)12312-3123");
		
		Conta cc1 = new Conta(cli01, 100, 1000, 1234, 123);
		
	
		
	
		String nome = cc1.cliente.getNomeCliente();
		System.out.println(nome);
		
		cc1.confirmaAcesso(100, 1000, 1234);

	}

}
