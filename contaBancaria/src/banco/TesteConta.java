package banco;
import java.util.Scanner;


public class TesteConta {

    public static void main(String[] args) {
    	
    	Cliente cli01 = new Cliente("Jonathan", "123.456.789-01", "(11)97481-8100");
    	Cliente cli02 = new Cliente("Giovane", "098.765.432-10", "(11)12345-6789");
    	
    	Conta ct01 = new Conta (cli01, 10, 123, 1000);
    	Conta ct02 = new Conta (cli02, 10, 123, 2000);
    	
    	ct01.transferencia(123,300.50,ct02);
    	
    	ct02.dadosCliente(123);

		

	//instanciar a classe Scanner "ler"
        
	//instanciar a classe Cliente "cliente1"

	//instanciar a classe Cliente "cliente2"

	
	//solicitar o saldo do cliente1

	//realizar saque do cliente1

	//realizar depósito do cliente1

	//realizar transferencia do cliente1 para o cliente2 .

	//ver saldo do cliente1

	//ver saldo do cliente2

  
    }
}
