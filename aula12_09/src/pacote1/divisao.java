package pacote1;

import javax.swing.JOptionPane;

public class divisao {

	public static void main(String[] args) {
		// Crie um código que solicite dois números e dê o resultado da divisão entre eles
		
		
		JOptionPane.showMessageDialog(null, "Digite dois numeros para realizar uma divisao");
		
		 String numeroTexto = JOptionPane.showInputDialog(null, "Digite um número", "Divisao", JOptionPane.QUESTION_MESSAGE);
		 double numeroInteiro = Integer.parseInt(numeroTexto);
		 
		 
		 String numeroTexto1 = JOptionPane.showInputDialog(null, "Digite outro número", "Divisao", JOptionPane.QUESTION_MESSAGE);
		 double numeroInteiro1 = Integer.parseInt(numeroTexto1);
		
		 
		 numeroInteiro = numeroInteiro/numeroInteiro1;
		 
		 JOptionPane.showMessageDialog(null, "o resultado eh " + numeroInteiro);
		
	}

}
