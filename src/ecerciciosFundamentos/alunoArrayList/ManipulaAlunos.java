package ecerciciosFundamentos.alunoArrayList;

import java.util.List;

import ecerciciosFundamentos.Aluno;

public class ManipulaAlunos {
	
	public static void cadastrar(String nome, double nota1, double nota2) {
		Aluno aluno = new Aluno(nome, nota1, nota2);
		ListaAlunos.getLista().add(aluno);
	}
	
	public static void listar() {
		List<Aluno> lista = ListaAlunos.getLista();
		/*for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNome() + 
					" Nota 1: " + lista.get(i).getNota1() + 
					" Nota 2: " + lista.get(i).getNota2() + 
					" Média: " + lista.get(i).getMedia());
		}*/
		if (lista.isEmpty()) {
			System.out.println("Lista vazia.");
		}
		for (Aluno aluno : lista) {
			System.out.println(aluno.getNome() + 
					" Nota 1: " + aluno.getNota1() + 
					" Nota 2: " + aluno.getNota2() + 
					" Média: " + aluno.getMedia());
		}
	}
	
	public static void alterar(String nome, double nota1, double nota2) {
		boolean achou = false;
		for (Aluno aluno : ListaAlunos.getLista()) {
			if (aluno.getNome().equals(nome)) {
				achou = true;
				aluno.setNota1(nota1);
				aluno.setNota2(nota2);
				aluno.setMedia((nota1 + nota2) / 2);
			}
		}
		if (!achou) {
			System.out.println("Não existe aluno cadastrado com o nome " + nome);
		}
	}
	
	public static void remover(int posicao) {
		try {
			ListaAlunos.getLista().remove(posicao);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Não existe aluno cadastrado na posição " + posicao);
		}
	}
	
	public static void remover(String nome) {
		boolean achou = false;
		for (Aluno aluno : ListaAlunos.getLista()) {
			if (aluno.getNome().equals(nome)) {
				achou = true;
				ListaAlunos.getLista().remove(aluno);
			}
		}
		if (!achou) {
			System.out.println("Não existe aluno cadastrado com o nome " + nome);
		}
	}
	
	public static int getQtdeAlunosMedia7OuMais() {
		int qtde = 0;
		for (Aluno aluno : ListaAlunos.getLista()) {
			if (aluno.getMedia() >= 7) {
				qtde++;
			}
		}
		return qtde;
	}
	
	public static int getQtdeAlunosMediaMenorQue7() {
		int qtde = 0;
		for (Aluno aluno : ListaAlunos.getLista()) {
			if (aluno.getMedia() < 7) {
				qtde++;
			}
		}
		return qtde;
	}
	
}
