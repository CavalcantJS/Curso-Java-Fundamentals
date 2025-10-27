package aula27_10;

import java.util.Scanner;

public class String_ignorarLetraMaiuscula {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a palavra 'Java': ");
		String textoDigitado = entrada.nextLine();

		String palavraFixa = "Java";

		System.out.println("\n=== Comparando com == ===");
		if (textoDigitado == palavraFixa) {
			System.out.println("Usando == → São IGUAIS");
		} else {
			System.out.println("Usando == → São DIFERENTES");
		}

		System.out.println("\n=== Comparando com equals() ===");
		if (textoDigitado.equals(palavraFixa)) {
			System.out.println("Usando equals() → São IGUAIS");
		} else {
			System.out.println("Usando equals() → São DIFERENTES");
		}

		System.out.println("\n=== Comparando com equalsIgnoreCase() ===");
		if (textoDigitado.equalsIgnoreCase(palavraFixa)) {
			System.out.println("Usando equalsIgnoreCase() → São IGUAIS");
		} else {
			System.out.println("Usando equalsIgnoreCase() → São DIFERENTES");
		}

		entrada.close();

	}

}
