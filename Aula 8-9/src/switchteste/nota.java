package switchteste;

import java.util.Scanner;

public class nota {
	
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digiteo numero correspondente a sua nota");
		 
		// 0 – De 0 a 3; 
		// 1 – De 3 a 5; 
		// 2 – De 5 a 10; 
	
		
		
		int escolha = ler.nextInt();
		
		switch(escolha) {
			
			case 0:
				System.out.println("Reprovado");
				return;
				
			case 1:
				System.out.println("Conselho");
				return;
				
			case 2:
				System.out.println("Aprovado");
				return;

				
			default:
				break;
		}
		
	}

}