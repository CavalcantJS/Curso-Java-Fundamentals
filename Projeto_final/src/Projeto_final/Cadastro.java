package Projeto_final;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	
	private List<Produto> produtos;
	private int proximoCod = 1;
	
	public Cadastro() {
		this.produtos = new ArrayList<>();
		
	}
	
	public void adicionarProduto(String nome_produto, double preco, int quantidade, String validade) {
		
		Produto produto = new Produto(nome_produto, proximoCod, preco, quantidade, validade);
		
		this.produtos.add(produto);
		proximoCod++;
		System.out.println("Produto: " + nome_produto + " adicionado com sucesso");
		
	}

	public void listarProduto() {
		
		if (produtos.isEmpty()) {
			
			System.out.println("nenhum produto cadastrado");
			return;
			
		}
		System.out.println("----- lista de produtos -----");
			for (Produto p : produtos) {
				
				System.out.println(p.toString());
				
			}
	}
	
	public void atualizarProduto(int codigo, String novoNome, double novoPreco, int novaQuantidade, String novaValidade) {
		
		for(Produto p: produtos) {
			if (p.getCodigo() == codigo) {
				
				p.setNome_produto(novoNome);
				p.setPreco(novoPreco);
				p.setQuantidade(novaQuantidade);
				p.setValidade(novaValidade);
				
				System.out.println("Produto "+ codigo + " atualizado.");
				return;
			}
		}
		
		System.out.println("produto nao encontrado");
		
	}
	public boolean isListavazia() {
		
		return this.produtos.isEmpty();
	}
	
	
	public void deletarProduto(int codigo) {
		
		Produto produtoparaRemover = null;
		
		for(Produto p : produtos) {
			
			if(p.getCodigo()== codigo) {
				produtoparaRemover = p;
				break;
				
			}
			
		}
		
		if(produtoparaRemover != null ) {
			
			produtos.remove(produtoparaRemover);
			System.out.println("o produto foi removido");
			
		}else {
			
			System.out.println("produto nao encontrado");
		}
	}
	
}
