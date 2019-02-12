package teoria.clasesParametrizadas;

import java.util.ArrayList;
import java.util.List;

public class ClaseCadenas {
	private List<String> lista = new ArrayList<>();
	
	
	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	//añadimos cadenas a la lista
	public void addCadena(String cadena) {
		lista.add(cadena);
	}
	
	//localizamos un objeto de la lista según posición
	public String obtenerCadenaPorPosicion(int posicion) {
		
		//para evitar la excepción de índice inexistente
		if (posicion < lista.size())
			return lista.get(posicion);
		else
			return null; //return ""; también se puede
	}
}
