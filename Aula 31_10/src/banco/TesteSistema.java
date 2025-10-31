package banco;

import java.util.Scanner;

public class TesteSistema {

	public static void main(String[] args) {
		
		
		
		Cadastro CadOper = new Cadastro("Jonathan", "123.456.789.01", 123);
		Operador o1 = new Operador(123456,"operador", 1550, CadOper);
		
		Cadastro CadSup = new Cadastro("Ismael", "400000000", 456);
		Supervisor s1 = new Supervisor(20253110, "Supervisor", 3000,CadSup);
		
		AcessoSistema si = new AcessoSistema();
		
		System.out.println("Quem esta acessando o sistema?");
		System.out.println("1 para operador");
		System.out.println("2 para supervisor");
		
		
		
		Scanner ler = new Scanner (System.in);
		int ler1 = ler.nextInt();
	
		if(ler1 == 1) {
			System.out.println("Seja bem-vindo operador!");
			si.acessoUtil(o1);
		}
		
		else if(ler1 == 2) {
			System.out.println("Seja bem-vindo Supervisor!");
			si.acessoUtil(s1);
		}

	}

}
