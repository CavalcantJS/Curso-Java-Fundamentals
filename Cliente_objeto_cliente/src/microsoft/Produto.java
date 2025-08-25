package microsoft;

public class Produto {
	
	public int codProduto;
	public String nome;
	public double preco;
	
	public Produto (int codProduto, String nome, double preco) {
		this.codProduto = codProduto;
		this.nome = nome;
		this.preco = preco;
		
		
		System.out.println("Objeto"+ nome +"obejto criado com sucesso");
	}
	

	
}
