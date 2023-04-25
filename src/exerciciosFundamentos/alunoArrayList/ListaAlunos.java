package exerciciosFundamentos.alunoArrayList;

import java.util.ArrayList;
import java.util.List;

import exerciciosFundamentos.Aluno;

public class ListaAlunos {

	private static List<Aluno> lista;
	
	public static List<Aluno> getLista() {
		if (lista == null) {
			lista = new ArrayList<Aluno>();
		}
		return lista;
	}
	
}
