package contabancaria;

import javax.swing.JOptionPane;

public class ContaCorrente {
	
	private int numeroCC;
	private String cliente;
	private int agencia;
	private double saldo;
	private int senha;
	private static int totalConta = 1000;
	
	public ContaCorrente(int agencia, String cliente,double saldo, int senha) {
		this.numeroCC = totalConta;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
		this.senha = senha;
		
		this.totalConta++;
		
		JOptionPane.showMessageDialog(null,
				"Conta nº " + this.numeroCC + " criada com sucesso");
	}
	
	public void autenticacliente(int senha, int agencia){
		
		boolean autentica = false;
		
		if (this.agencia != agencia) {
			System.out.println("dados inválidos");

		}else if(this.senha == senha) {
			
			System.out.println("login efetuado");
		}
		 
		 
		 
	 }
	
	public void sacar ( double saque, double novosaldo) {
		boolean confirmaSaldo = false;
		
		
		
		if(saldo>= saque) {
			novosaldo = saldo - saque;
			
			System.out.println("Saldo realizado com sucesso");
		} else if(saldo<saque){
			
			System.out.println("saldo insuficiente");
			
		}
		
	
		
		
		
		
	}
	
	//Metodo autentica senha
	
	//Metodo saque
	
	//Metodo saldo
	
	//Metodo transferencia
	
	//Metodo trocar senha
	
}
