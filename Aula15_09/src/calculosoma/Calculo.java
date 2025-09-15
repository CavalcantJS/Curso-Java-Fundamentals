package calculosoma;

import javax.swing.JOptionPane;

public class Calculo {

	 public void soma2(){
		
		String num1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero", "Soma dois numeros",JOptionPane.QUESTION_MESSAGE);
	    String num2 = JOptionPane.showInputDialog(null, "Digite o segundo numero", "Soma dois numeros",JOptionPane.QUESTION_MESSAGE);
	    
	    
		 if(num1 == null || num1.isEmpty()) {
		    	return;
		    }else if(num2 == null || num2.isEmpty()) {
		    	return;
		    }
	    
	    double num1int = Double.parseDouble(num1);
		double num2int = Double.parseDouble(num2);
		
	    
	    num1int = num1int + num2int;
	    
	    JOptionPane.showMessageDialog(null, "O resultado da soma é " + num1int);
		

	 	}
	 
	 	public void soma3() {
		 
		 String num1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero", "Soma três numeros",JOptionPane.QUESTION_MESSAGE);
		 String num2 = JOptionPane.showInputDialog(null, "Digite o segundo numero", "Soma três numeros",JOptionPane.QUESTION_MESSAGE);
		 String num3 = JOptionPane.showInputDialog(null, "Digite o terceiro numero", "Soma três numeros",JOptionPane.QUESTION_MESSAGE);
		 
		 
		 if(num1 == null || num1.isEmpty()) {
		    	return;
		    }else if(num2 == null || num2.isEmpty()) {
		    	return;
		    }else if(num3 == null || num3.isEmpty()) {
		    	return;
		    }
		 
		 double num1int = Double.parseDouble(num1);
		 double num2int = Double.parseDouble(num2);
		 double num3int = Double.parseDouble(num3);
		 
		 
		 num1int = num1int + num2int + num3int;
		    
		    JOptionPane.showMessageDialog(null, "O resultado da soma é " + num1int);
			
		 
	 	}
	 
	 	public void soma4() {
		 
		 String num1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero", "Soma quatro numeros",JOptionPane.QUESTION_MESSAGE);
		 String num2 = JOptionPane.showInputDialog(null, "Digite o segundo numero", "Soma quatro numeros",JOptionPane.QUESTION_MESSAGE);
		 String num3 = JOptionPane.showInputDialog(null, "Digite o terceiro numero", "Soma quatro numeros",JOptionPane.QUESTION_MESSAGE);
		 String num4 = JOptionPane.showInputDialog(null, "Digite o quarto numero", "Soma quatro numeros",JOptionPane.QUESTION_MESSAGE);
		 
		 
		 if(num1 == null || num1.isEmpty()) {
		    	return;
		    }else if(num2 == null || num2.isEmpty()) {
		    	return;
		    }else if(num3 == null || num3.isEmpty()) {
		    	return;
		    }else if(num4 == null || num4.isEmpty()) {
			    return;
		    }
		 
		 double num1int = Double.parseDouble(num1);
		 double num2int = Double.parseDouble(num2);
		 double num3int = Double.parseDouble(num3);
		 double num4int = Double.parseDouble(num4);
		 
		 
		 num1int = num1int + num2int + num3int + num4int;
		    
		    JOptionPane.showMessageDialog(null, "O resultado da soma é " + num1int);
			
	 
	 	}
	 
	 	public void soma5() {
		 
		 String num1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero", "Soma cinco numeros",JOptionPane.QUESTION_MESSAGE);
		 String num2 = JOptionPane.showInputDialog(null, "Digite o segundo numero", "Soma cinco numeros",JOptionPane.QUESTION_MESSAGE);
		 String num3 = JOptionPane.showInputDialog(null, "Digite o terceiro numero", "Soma cinco numeros",JOptionPane.QUESTION_MESSAGE);
		 String num4 = JOptionPane.showInputDialog(null, "Digite o quarto numero", "Soma cinco numeros",JOptionPane.QUESTION_MESSAGE);
		 String num5 = JOptionPane.showInputDialog(null, "Digite o quinto numero", "Soma cinco numeros",JOptionPane.QUESTION_MESSAGE);
		 
		 if(num1 == null || num1.isEmpty()) {
		    	return;
		    }else if(num2 == null || num2.isEmpty()) {
		    	return;
		    }else if(num3 == null || num3.isEmpty()) {
		    	return;
		    }else if(num4 == null || num4.isEmpty()) {
			    return;
		    }else if(num5 == null || num5.isEmpty()) {
		    	return;
		    }
		 
		 double num1int = Double.parseDouble(num1);
		 double num2int = Double.parseDouble(num2);
		 double num3int = Double.parseDouble(num3);
		 double num4int = Double.parseDouble(num4);
		 double num5int = Double.parseDouble(num5);
		 
		 
		 num1int = num1int + num2int + num3int + num4int + num5int;
		    
		    JOptionPane.showMessageDialog(null, "O resultado da soma é " + num1int);
			
	 
	 }
}
