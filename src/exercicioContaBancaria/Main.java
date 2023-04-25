package exercicioContaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("--Menu contas bancárias--");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - listar");
			System.out.println("3 - Entrar");
			System.out.println("0 - Sair");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1: cadastrar(scan); break;
			case 2: listar(); break;
			case 3: entrar(scan);
			}
		} while (opcao != 0);
	}
	
	private static void cadastrar(Scanner scan) {
		System.out.print("Agência: ");
		int agencia = scan.nextInt();
		System.out.print("Conta: ");
		int conta = scan.nextInt();
		System.out.print("Nome do cliente: ");
		String nomeCliente = scan.next();
		ManipulaContas.cadastrar(agencia, conta, nomeCliente);
	}
	
	private static void listar() {
		ManipulaContas.listar();
	}
	
	private static void entrar(Scanner scan) {
		System.out.print("Agência: ");
		int agencia = scan.nextInt();
		System.out.print("Conta: ");
		int conta = scan.nextInt();
		ContaBancaria contaBancaria = ManipulaContas.acessaConta(agencia, conta);
		if (contaBancaria != null) {
			int opcao = 0;
			do {
				System.out.println("--Menu conta de " + contaBancaria.getNomeCliente() + "--");
				System.out.println("1 - Sacar");
				System.out.println("2 - Depositar");
				System.out.println("3 - Extrato");
				System.out.println("0 - Sair");
				opcao = scan.nextInt();
				
				switch (opcao) {
				case 1: sacar(scan, contaBancaria); break;
				case 2: depositar(scan, contaBancaria); break;
				case 3: extrato(contaBancaria);
				}
			} while (opcao != 0);
		}
	}
	
	private static void sacar(Scanner scan, ContaBancaria contaBancaria) {
		System.out.print("Valor à sacar: ");
		int valor = scan.nextInt();
		contaBancaria.sacar(valor);
	}
	
	private static void depositar(Scanner scan, ContaBancaria contaBancaria) {
		System.out.print("Valor à depositar: ");
		int valor = scan.nextInt();
		contaBancaria.depositar(valor);
	}
	
	private static void extrato(ContaBancaria contaBancaria) {
		contaBancaria.verExtrato();
	}

}
