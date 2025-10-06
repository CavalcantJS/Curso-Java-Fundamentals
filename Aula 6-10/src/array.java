import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		String[] nomes = new String[4];
		Scanner ler = new Scanner(System.in);
		
		
		for(int i = 0; i < nomes.length; i++) {
			
			
			System.out.println("Digite os elementos dos vetores");
			nomes[i] = ler.nextLine();
			
		}
		
		for(int i = 0; i < nomes.length; i++) {
			
			System.out.println(nomes[i]);
			
		}
		
	}

}
