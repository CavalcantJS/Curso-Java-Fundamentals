package banco;
import java.util.Scanner;

public class Cliente {
	
	protected String nomeCliente;
	protected String cpfCliente;
	protected String telefoneCliente;
	
	public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente) {
		
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneCliente = telefoneCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}	

	public String getCpfCliente() {
		return cpfCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}
}
