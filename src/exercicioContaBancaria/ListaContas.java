package exercicioContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class ListaContas {
	private static List<ContaBancaria> lista;
	
	public static List<ContaBancaria> getLista() {
		if (lista == null) {
			lista = new ArrayList<ContaBancaria>();
		}
		return lista;
	}
}
