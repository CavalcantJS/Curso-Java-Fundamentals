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
    
public Conta(Cliente cliente, int agencia, int senha, double saldo) {
	
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
			
			System.out.println("Seu saldo é de:" + this.saldo);
			
		}else {
			
			System.out.println("Senha incorreta");
		}
		
	}

	
	public boolean saque(int senha, double valor) {
	    boolean confirma = false;
	    
	    if (this.senha == senha) {
	        if (this.saldo >= valor) {
	            this.saldo -= valor;
	            System.out.println("Saque realizado");
	            confirma = true;
	        } else {
	            System.out.println("Saldo insuficiente");
	        }
	    } else {
	        System.out.println("Senha inválida");
	    }

	    return confirma;
	}

	
	public void deposito(double valor) {
		
		this.saldo += valor;
		System.out.println("valor depositado");
		
	}
	
	
	public void transferencia(int senha, double valor, Conta c) {
		
		boolean conf = saque(senha, valor);
		
		if (conf) {
			
			c.deposito(valor);
			System.out.println("transferencia realizada com sucesso");
			
		
	}else {
		
		System.out.println("transferencia cancelada");
	}
		
		
	}
	
	
	public void dadosCliente(int senha) {
		
		if (this.senha == senha) {
			
			System.out.println("Dados do Cliente" + "\n" + "Nome: " + this.cliente.nomeCliente + "\n" + "CPF: " + this.cliente.cpfCliente + "\n" + "telefone: " + this.cliente.telefoneCliente);
			
		}else {
			
			System.out.println("Senha inválida");
		}
		
	}
	
	
	
}
    // Construtor


    //Saldo
 


    //Saque



    //Depósito
    


    //Transferência
   



    // Método para exibir as informações da conta
    

