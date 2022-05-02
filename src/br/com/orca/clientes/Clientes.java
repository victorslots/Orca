package br.com.orca.clientes;

public class Clientes {
	private String nome;
	private int telefone;
	private String servico;
	
	private static int qtdeClientes = 0;
	
	public Clientes() { qtdeClientes += 1; }
	
	public Clientes(String name, int phone) {
		nome = name;
		telefone = phone;
	}
	
	public void setNome(String newName) {
		nome = newName;
	}
	public void setTelefone(String newPhone) {
		nome = newPhone;
	}
	public String getNome() {
		return nome;
	}
	public int getPhone() {
		return telefone;
	}
}