package ecerciciosFundamentos.alunoHashMap;

import java.util.Scanner;

import ecerciciosFundamentos.Pessoa;
import ecerciciosFundamentos.Temperatura;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Exercício 1
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Teobaldo");
		pessoa.setIdade(71);
		pessoa.setCidade("Blumenau");
		System.out.println(pessoa.exibirDados());
		
		//Exercício 2
		System.out.println(Temperatura.converterCelsiusParaFahrenheit(38));
		System.out.println(Temperatura.converterFahrenheitParaCelsius(100.4));
		
		//Exercício 3
		int opcao = 0;
		do {
			System.out.println("--Menu--");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - listar");
			System.out.println("3 - Alterar");
			System.out.println("4 - Remover por posicao");
			System.out.println("5 - Remover por nome");
			System.out.println("6 - Quantidade alunos média 7 ou mais");
			System.out.println("7 - Quantidade alunos abaixo da média");
			System.out.println("0 - Sair");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1: cadastrar(scan); break;
			case 2: listar(); break;
			case 3: alterar(scan); break;
			case 5: removerPorNome(scan); break;
			case 6: mostrarQtdeAlunosMedia7OuMais(); break;
			case 7: mostrarQtdeAlunosAbaixoDaMedia();
			}
		} while (opcao != 0);
	}
	
	private static void cadastrar(Scanner scan) {
		System.out.print("Nome: ");
		String nome = scan.next();
		System.out.println("Nota 1: ");
		Double nota1 = scan.nextDouble();
		System.out.println("Nota 2: ");
		Double nota2 = scan.nextDouble();
		ManipulaAlunos.cadastrar(nome, nota1, nota2);
	}
	
	private static void listar() {
		ManipulaAlunos.listar();
	}
	
	private static void alterar(Scanner scan) {
		System.out.print("Nome: ");
		String nome = scan.next();
		System.out.println("Nota 1: ");
		Double nota1 = scan.nextDouble();
		System.out.println("Nota 2: ");
		Double nota2 = scan.nextDouble();
		ManipulaAlunos.alterar(nome, nota1, nota2);
	}
	
	private static void removerPorNome(Scanner scan) {
		System.out.print("Nome: ");
		String nome = scan.next();
		ManipulaAlunos.remover(nome);
	}
	
	private static void mostrarQtdeAlunosMedia7OuMais() {
		System.out.println("Quantidade de alunos com média 7 ou mais: " + ManipulaAlunos.getQtdeAlunosMedia7OuMais());
	}
	
	private static void mostrarQtdeAlunosAbaixoDaMedia() {
		System.out.println("Quantidade de alunos abaixo da média: " + ManipulaAlunos.getQtdeAlunosMedia7OuMais());
	}

}
