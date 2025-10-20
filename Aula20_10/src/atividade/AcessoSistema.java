package atividade;

import java.util.Scanner;

public class AcessoSistema {
	
	Scanner ler = new Scanner(System.in);
	
	public void acessoSistema(SenhaSistema s) {
		
		System.out.println("Digite a senha de acesso ao sistema:");
		int senha = ler.nextInt();
		s.sistema(senha);
		
	}

	
	
}
