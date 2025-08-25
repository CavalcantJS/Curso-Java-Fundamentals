package Atividade;

public class Teste_estoque {
	
	public static void main(String[] args) {
		
	Estoque e1 = new Estoque();
	
	e1.setor = "alimenticio";
	e1.fornecedor = "friboi";
	e1.produto = "picanha";
	
	System.out.println("setor: " +e1.setor);
	System.out.println("fornecedor: " +e1.fornecedor);
	System.out.println("produto: " +e1.produto);
	
		
		
	Funcionário f1 = new Funcionário("Joao", "Estoquista", "Quarta-Feira");
	
	
	}
	
	

}
