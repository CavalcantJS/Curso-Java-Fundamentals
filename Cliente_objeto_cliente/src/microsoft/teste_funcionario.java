package microsoft;

public class teste_funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		Produto p1 = new Produto(100, "arroz", 20.0);
		
		
		f1.CPF = "123.456.789.01";
		f1.nome = "Jonathan Cavalcante da Silva";
		f1.telefone = "(11) 97481-8100";
		
		f2.CPF = "987.654.321.09";
		
		System.out.println("CPF " + f1.CPF);
		System.out.println("Nome " + f1.nome);
		System.out.println("Telefone " + f1.telefone);
		System.out.println(f2);
		
		
		
	
	}

}
