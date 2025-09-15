package calculosoma;

import javax.swing.JOptionPane;

public class TesteCalculo {
	
	public static void main(String[] args) {
		
	    JOptionPane.showMessageDialog(null, "Calculadora de soma");
	    
	    
	    int continua = 0;
	    
	    
	    do {
	    	String opt = JOptionPane.showInputDialog(null, "Selecione quantos numeros você quer somar(2,3,4 ou 5)", "Calculadora de soma",JOptionPane.QUESTION_MESSAGE);
	    	if(opt == null || opt.isEmpty()) {
		    	break;
		    }
			
		    int optint = Integer.parseInt(opt);
	    
	    	if(optint == 2) {
		
	    		Calculo op = new Calculo();
		
	    		op.soma2();
	    	}
	    	else if(optint == 3){
	    	
	    		Calculo op = new Calculo();
			
	    		op.soma3();
	    	
	    	
	    	}
	    	else if(optint == 4){
	    	
	    		Calculo op = new Calculo();
			
	    		op.soma4();
	    	}
	    	else if(optint == 5){
	    	
	    		Calculo op = new Calculo();
			
	    		op.soma5();
	    	}
	    	else {
	    	
	    		JOptionPane.showMessageDialog(null, "Opção inválida");
	    	
	    	}
	    	
	    	String continuaTexto = JOptionPane.showInputDialog(null, "Voce deseja realizar outra soma? \n Digite 1 para sim e 2 para nao ", "Continuar?", JOptionPane.QUESTION_MESSAGE);
	    	if(opt == null || opt.isEmpty()) {
		    	break;
		    }
		    continua = Integer.parseInt(continuaTexto);
	    
	  }while (continua !=2);

}
}