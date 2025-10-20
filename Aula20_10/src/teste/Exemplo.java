package teste;

public class Exemplo {

	public static void modificarModelo(Carro carro) {
		
		carro.modelo = "Fusca";
		
	}

	public static void main(String[] args) {
		
		Carro meucarro = new Carro("Ferroviario");
		System.out.println("Antes " + meucarro.modelo);
		
		modificarModelo(meucarro);
		
		System.out.println("Depois " + meucarro.modelo);
		
	}
	
}
