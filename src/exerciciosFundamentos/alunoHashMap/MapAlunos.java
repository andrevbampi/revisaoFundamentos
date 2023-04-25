package exerciciosFundamentos.alunoHashMap;

import java.util.HashMap;
import java.util.Map;

import exerciciosFundamentos.Aluno;

public class MapAlunos {
	
	private static Map<String, Aluno> map;
	
	public static Map<String, Aluno> getMap() {
		if (map == null) {
			map = new HashMap<String, Aluno>();
		}
		return map;
	}
	
}
