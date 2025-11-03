package Projeto_final;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scannerS = new Scanner(System.in);
		
		Cadastro cadastro = new Cadastro();
		int opcao = 0;
		
		while (opcao !=5) {
			System.out.println("\n --- Sistema de cadastro de produtos ---");
			System.out.println("Digite 1 para adicionar produto");
			System.out.println("Digite 2 para ver a lista de produtos");
			System.out.println("Digite 3 para atualizar produto");
			System.out.println("Digite 4 para remover produto");
			System.out.println("Digite 5 para sair");
		
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcao) {
			
			case 1:
				System.out.println("Nome do produto: ");
				String nome = scanner.nextLine();
				
				System.out.println("Preco do produto: ");
				double preco = scanner.nextDouble();
				
				System.out.println("Quantidade do produto: ");
				int quantidade = scanner.nextInt();
				
				System.out.println("Validade do produto: ");
				String validade = scannerS.nextLine();
				
				cadastro.adicionarProduto(nome, preco, quantidade, validade);
				break;
				
			case 2:
				cadastro.listarProduto();
				break;
				
			case 3:
				
				if(cadastro.isListavazia()) {
					
					System.out.println("Nenhum produto em estoque para atualizar");
					break;
				}
				
				
				System.out.println("Insira o codigo do produto que sera atualizado");
				
				int codigoAtualizar = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Novo nome do produto: ");
				String novoNome = scanner.nextLine();
				
				System.out.println("Novo preco do produto: ");
				double novoPreco = scanner.nextDouble();
				
				System.out.println("Nova quantidade do produto: ");
				int novaQuantidade = scanner.nextInt();
				
				System.out.println("Nova validade do produto: ");
				String novaValidade = scannerS.nextLine();
				
				cadastro.atualizarProduto(codigoAtualizar, novoNome, novoPreco, novaQuantidade, novaValidade);
				break;
				
			case 4:
				System.out.println("Insira o codigo do produto que sera removido");
				
				int codigoDeletar = scanner.nextInt();
				cadastro.deletarProduto(codigoDeletar);
				break;
				
			case 5:
				System.out.println("Saindo do sistema...");
				break;
				
			default:
				System.out.println("Opcao invalida");
			}
		}
		
		scanner.close();
		scannerS.close();
	}

}
