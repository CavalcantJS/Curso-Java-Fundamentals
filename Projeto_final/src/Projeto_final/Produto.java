package Projeto_final;

public class Produto {

	String nome_produto;
	double preco;
	int codigo;
	int quantidade;
	String validade;
	
	public Produto(String nome_produto, int codigo, double preco, int quantidade, String validade) {
		
		this.nome_produto = nome_produto;
		this.preco = preco;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.validade = validade;
		
		
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	
	@Override
	public String toString() {
		
		return "Produto: "+nome_produto+ ", Codigo : " + codigo+ ", Quantidade : "+ quantidade + ", Validade : "+ validade;
		
	}
	
	}
