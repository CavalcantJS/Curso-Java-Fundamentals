package operacao;

import javax.swing.JOptionPane;

public class operacoes {

	public void condicoesdemaioridade() {
		

		boolean numeroBoleano = true;
		while(numeroBoleano) {
		
		 String palavra1 = JOptionPane.showInputDialog(null, "Digite seu nome", "Nome", JOptionPane.QUESTION_MESSAGE);
		    String numeroTexto = JOptionPane.showInputDialog(null, "Digite sua idade", "Idade", JOptionPane.QUESTION_MESSAGE);

		    int numeroInteiro = Integer.parseInt(numeroTexto);
		    
		    if(numeroInteiro >= 18) {
		    	JOptionPane.showMessageDialog(null,"Parabéns, "+ palavra1 + " você já pode dirigir!");
		    }else {
		    	JOptionPane.showMessageDialog(null, "Você ainda não pode dirigir " + palavra1);
		    		
		   }
		    
		    String palavra2 = JOptionPane.showInputDialog(null, "Digite sim ou não", "Tentar de novo", JOptionPane.QUESTION_MESSAGE);
		    if (palavra2 == null || !palavra2.equalsIgnoreCase("sim")) {
                numeroBoleano = false;
            }
		    
		}
		 JOptionPane.showMessageDialog(null, "Programa finalizado.");
		    
		
	}

}
