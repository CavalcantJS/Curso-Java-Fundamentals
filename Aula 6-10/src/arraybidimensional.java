import java.util.Scanner;

public class arraybidimensional {

    public static void main(String[] args) {
        
        int linhas = 4;
        int colunas = 5;

       
        int[][] matriz = new int[linhas][colunas];

      
        Scanner entrada = new Scanner(System.in);

       
        System.out.println("Por favor, insira os elementos da matriz:");

      
        for (int i = 0; i < linhas; i++) {
           
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        
        System.out.println("\nA matriz que você inseriu é:");

        
        for (int i = 0; i < linhas; i++) {
           
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        
            System.out.println();
        }


        entrada.close();
    }
}