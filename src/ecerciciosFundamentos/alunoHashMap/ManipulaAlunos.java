package ecerciciosFundamentos.alunoHashMap;

import java.util.Map;
import java.util.Set;

import ecerciciosFundamentos.Aluno;

public class ManipulaAlunos {
	
	public static void cadastrar(String nome, double nota1, double nota2) {
		Aluno aluno = new Aluno(nome, nota1, nota2);
		MapAlunos.getMap().put(nome, aluno);
	}
	
	public static void listar() {
		Map<String, Aluno> map = MapAlunos.getMap();
		if (map.isEmpty()) {
			System.out.println("Lista vazia.");
		}
		Set<String> chaves = map.keySet();
		for (String chave : chaves) {
			System.out.println(map.get(chave).getNome() + 
					" Nota 1: " + map.get(chave).getNota1() + 
					" Nota 2: " + map.get(chave).getNota2() + 
					" Média: " + map.get(chave).getMedia());
		}
	}
	
	public static void alterar(String nome, double nota1, double nota2) {
		Aluno aluno = MapAlunos.getMap().get(nome);
		if (aluno == null) {
			System.out.println("Não existe aluno cadastrado com o nome " + nome);
		}
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		aluno.setMedia((nota1 + nota2) / 2);
	}
	
	public static void remover(String nome) {
		MapAlunos.getMap().remove(nome);
	}
	
	public static int getQtdeAlunosMedia7OuMais() {
		Map<String, Aluno> map = MapAlunos.getMap();
		int qtde = 0;
		Set<String> chaves = map.keySet();
		for (String chave : chaves) {
			if (map.get(chave).getMedia() >= 7) {
				qtde++;
			}
		}
		return qtde;
	}
	
	public static int getQtdeAlunosMediaMenorQue7() {
		Map<String, Aluno> map = MapAlunos.getMap();
		int qtde = 0;
		Set<String> chaves = map.keySet();
		for (String chave : chaves) {
			if (map.get(chave).getMedia() < 7) {
				qtde++;
			}
		}
		return qtde;
	}
	
}
