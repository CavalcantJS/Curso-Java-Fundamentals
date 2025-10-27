package aula27_10;

public class CharcompareString {
	public static void main(String[] args) {
	
	// --- Exemplo com char ---
			char letra = 'J'; // Apenas um caractere
			char digito = '5';
			char simbolo = '#';

			System.out.println("Usando char:");
			System.out.println("Letra: " + letra);
			System.out.println("Dígito: " + digito);
			System.out.println("Símbolo: " + simbolo);
			System.out.println();

			// --- Exemplo com String ---
			String palavra = "Java"; // Sequência de caracteres
			String frase = "Aprendendo Java é divertido!";
			String numeroComoTexto = "12345";

			System.out.println("Usando String:");
			System.out.println("Palavra: " + palavra);
			System.out.println("Frase: " + frase);
			System.out.println("Número como texto: " + numeroComoTexto);
			System.out.println();

			// --- Diferenças práticas ---
			System.out.println("Diferenças práticas:");

			// 1️⃣ char não tem métodos
			System.out.println("Letra em maiúsculo (char): " + letra); // não muda, pois char é fixo

			// 2️⃣ String tem vários métodos úteis
			System.out.println("Palavra em maiúsculo: " + palavra.toUpperCase());
			System.out.println("Tamanho da palavra: " + palavra.length());
			System.out.println("Primeira letra da palavra: " + palavra.charAt(0));

			// 3️⃣ Conversão entre char e String
			String letraComoString = String.valueOf(letra); // char → String
			char primeiraLetra = palavra.charAt(0); // String → char

			System.out.println();
			System.out.println("Convertendo char para String: " + letraComoString);
			System.out.println("Convertendo String para char: " + primeiraLetra);

	}
}
