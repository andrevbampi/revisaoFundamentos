package exercicioContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
	private int agencia;
	private int conta;
	private String nomeCliente;
	private double valor;
	private List<String> listaExtrato;
	private List<Emprestimo> listaEmprestimos;
	
	public ContaBancaria(int agencia, int conta, String nomeCliente) {
		setAgencia(agencia);
		setConta(conta);
		setNomeCliente(nomeCliente);
		valor = 0;
		listaExtrato = new ArrayList<String>();
		listaEmprestimos = new ArrayList<Emprestimo>();
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getValor() {
		return valor;
	}
	
	public void depositar(double valor) {
		this.valor = this.valor + valor;
		listaExtrato.add("Depositou " + valor + " reais.");
	}
	
	public void sacar(double valor) {
		if (this.valor < valor) {
			System.out.println("Saldo insuficiente");
		} else {
			this.valor = this.valor - valor;
			listaExtrato.add("Sacou " + valor + " reais.");
		}
	}
	
	public void verExtrato() {
		for (String operacao : listaExtrato) {
			System.out.println(operacao);
		}
		System.out.println("Saldo: " + valor);
		Double limiteEmprestimo = 0.0;
		if (valor > 1000) {
			limiteEmprestimo = valor * 0.3;
		}
		System.out.println("Limite de emprestimo: " + limiteEmprestimo);
	}
}
