package jogo;


import java.util.Scanner;

public class arena {

    public static void main(String[] args) {

       
        Scanner scanner = new Scanner(System.in);

        
        guerreiro jogador = new guerreiro("Heroi", 85, 85);

      
        guerreiro[] adversarios = new guerreiro[3];
        adversarios[0] = new guerreiro("Devorador de mentes", 95, 40);
        adversarios[1] = new guerreiro("Vigia de aco", 50, 90);
        adversarios[2] = new guerreiro("Tia ethel", 85, 80);

        System.out.println("Bem-vindo a Arena! Voce enfrentara " + adversarios.length + " adversarios.");
        
       
        for (int i = 0; i < adversarios.length; i++) {
            guerreiro inimigoAtual = adversarios[i];
            
            System.out.println("Seus Atributos -> Forca: " + jogador.forca + " | Velocidade: " + jogador.velocidade);
            System.out.println("\n=== PROXIMO COMBATE: " + inimigoAtual.nome + " ===");
           
            
            System.out.print("\nQual caracteristica voce quer usar? (Digite 'forca' ou 'velocidade'): ");
            String escolha = scanner.nextLine();
            
           
            luta batalha = new luta();
            boolean jogadorVenceu = batalha.iniciarBatalha(jogador, inimigoAtual, escolha);
            
           
            if (jogadorVenceu) {
                System.out.println("Voce derrotou " + inimigoAtual.nome + " e avanca para o proximo!");
            } else {
                System.out.println("\nVOCE FOI DERROTADO! Fim de jogo.");
                break; 
            }
        }
        
       
        System.out.println("\nO jogo terminou.");

      
        scanner.close();
    }
}