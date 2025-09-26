package banco;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Conta {
    Cliente cliente;
    private int agencia;
    private int numero;
    private int senha;
    private double saldo;
    private static int totalConta = 1000;
    
     Scanner ler = new Scanner(System.in);
    
public Conta(Cliente cliente, int agencia, int numero, double saldo, int senha) {
	
	this.cliente = cliente;
	this.agencia = agencia;
	this.senha = senha;
	this.saldo = saldo;
	
	this.numero = totalConta;
	totalConta++;
}

	private void saldo() {
		
		    System.out.println("Digite sua senha");
		int senha = ler.nextInt();
		
		if(this.senha == senha) {
			
			System.out.println("Seu saldo é de:" + saldo);
			
		}else {
			
			System.out.println("Senha incorreta");
		}
		
	}

	
	private void saque() {
		
	
		
		 System.out.println("Digite o valor que gostaria de sacar");
		   double valor = ler.nextDouble();
		   
		if(saldo >= valor) {
			System.out.println("Digite sua senha");
			int senha = ler.nextInt();
			
			if(this.senha == senha) {
				System.out.println("saque realizado com sucesso");
				saldo -= valor;
			}else {
			System.out.println("Senha incorreta");
				
			}
			
		}else {
			
			System.out.println("Saldo insuficiente");
		}
		
		
	}
	
	private void deposito() {
		
		 System.out.println("Digite o valor que gostaria de depositar");
		   double valor = ler.nextDouble();
		   
		   System.out.println("Digite sua senha");
		   int senha = ler.nextInt();
		   
		   if(this.senha == senha) {
				System.out.println("depósito realizado com sucesso");
				saldo += valor;
			   
		   }else {
			   System.out.println("Senha incorreta");
			   
		   }
		
		
	}
	
	
}
    // Construtor


    //Saldo
 


    //Saque



    //Depósito
    


    //Transferência
   



    // Método para exibir as informações da conta
    

