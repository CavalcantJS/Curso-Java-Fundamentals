package Jogonumerosecreto;
import java.util.Scanner;
import java.util.Random;


public class secreto1 {
	
	public static void main(String[] args) {
		

	Random rand = new Random();
	Scanner ler = new Scanner(System.in);
	
	
	
	
	
	int seletor=0;
	
	do {
		int secreto = rand.nextInt(10) + 1;
		System.out.println("DIGITE UM NUMERO DE 1 A 10");
		System.out.println("voce tem 3 chances");
		
	for(int i = 0; i<3; i++) {
		int numUsuario;
		
		numUsuario = ler.nextInt();
		if(numUsuario == secreto) {
			
			System.out.println("Parabens!!! Voce acertou!");
			break;
			
		}else {
			
			System.out.println("Tente novamente");
			
			}
		
		}
	System.out.println("Para tentar novamente, pressione 1");
	
	seletor = ler.nextInt();
	
	
	}while(seletor ==1);
	
	System.out.println("Programa encerrado");
	
	}
}