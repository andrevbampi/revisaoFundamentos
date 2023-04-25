package ecerciciosFundamentos.alunoHashMap;

import java.util.HashMap;
import java.util.Map;

import ecerciciosFundamentos.Aluno;

public class MapAlunos {
	
	private static Map<String, Aluno> map;
	
	public static Map<String, Aluno> getMap() {
		if (map == null) {
			map = new HashMap<String, Aluno>();
		}
		return map;
	}
	
}
