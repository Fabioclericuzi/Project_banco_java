package entidades;

public class Conta {
	
	public int numero;
	public String nome;
	public double saldo;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		
	}
	public Conta(int numero, String nome, double DepositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(DepositoInicial);
		
	}
	
	public int getNumero() {
		return numero;
	}
	public String getNome() {
		return nome;
	}
	public String setNome() {
		return nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	public String toString() {
		return "Conta " 
				+ numero
				+", Nome do titular: "
				+ nome
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);
				
	}
}
