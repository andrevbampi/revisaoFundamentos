package exercicioContaBancaria;

import java.util.List;

public class ManipulaContas {
	
	public static void cadastrar(int agencia, int conta, String nomeCliente) {
		ContaBancaria contabancaria = new ContaBancaria(agencia, conta, nomeCliente);
		ListaContas.getLista().add(contabancaria);
	}
	
	public static void listar() {
		List<ContaBancaria> lista = ListaContas.getLista();
		if (lista.isEmpty()) {
			System.out.println("Lista vazia.");
		}
		for (ContaBancaria contaBancaria : lista) {
			System.out.println(contaBancaria.getNomeCliente() + 
					" Agência: " + contaBancaria.getAgencia() + 
					" Conta: " + contaBancaria.getConta() + 
					" Valor: " + contaBancaria.getValor());
		}
	}
	
	public static ContaBancaria acessaConta(int agencia, int conta) {
		List<ContaBancaria> lista = ListaContas.getLista();
		for (ContaBancaria contaBancaria : lista) {
			if (contaBancaria.getAgencia() == agencia
					&& contaBancaria.getConta() == conta) {
				return contaBancaria;
			}
		}
		System.out.println("Conta não encontrada");
		return null;
	}
	
}
