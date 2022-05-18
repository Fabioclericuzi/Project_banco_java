package Aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Deseja realizar um deposito inicial: (s/n)? ");
		char resposta = sc.next().charAt(0);
		if(resposta=='s') {
			System.out.println("Informe o valor do depósito: ");
			double DepositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, DepositoInicial);
		}
		else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Informe o valor do depósito: ");
		double valordeposito = sc.nextDouble();
		conta.deposito(valordeposito);
		System.out.print("Dados atualizados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Informa o valor do saque: ");
		double valorsaque = sc.nextDouble();
		conta.saque(valorsaque);
		System.out.print("Dados atualizados da conta: ");
		System.out.println(conta);
		
		sc.close();
		
		
		

	}

}
