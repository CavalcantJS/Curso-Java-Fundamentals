package aula27_10;

public class FunctionString {

	public static void main(String[] args) {
		// --- Tipos primitivos (char) ---
				char letra1 = 'A';
				char letra2 = 'A';
				char letra3 = 'B';

				// --- Objetos (String) ---
				String palavra1 = "Java";
				String palavra2 = "Java";
				String palavra3 = new String("Java"); // Cria um novo objeto na memória

				System.out.println("=== Comparando char ===");
				System.out.println("letra1 == letra2 ? " + (letra1 == letra2)); // true (mesmo valor)
				System.out.println("letra1 == letra3 ? " + (letra1 == letra3)); // false (valores diferentes)
				System.out.println();

				System.out.println("=== Comparando String ===");
				System.out.println("palavra1 == palavra2 ? " + (palavra1 == palavra2)); // true (mesma referência, pois são do
																						// pool de strings)
				System.out.println("palavra1 == palavra3 ? " + (palavra1 == palavra3)); // false (objetos diferentes na memória)
				System.out.println("palavra1.equals(palavra3) ? " + palavra1.equals(palavra3)); // true (mesmo conteúdo)
				System.out.println();

				// --- Observação prática ---
				System.out.println("=== Diferença visual ===");
				System.out.println("palavra1 (endereço): " + System.identityHashCode(palavra1));
				System.out.println("palavra2 (endereço): " + System.identityHashCode(palavra2));
				System.out.println("palavra3 (endereço): " + System.identityHashCode(palavra3));

	}

}
