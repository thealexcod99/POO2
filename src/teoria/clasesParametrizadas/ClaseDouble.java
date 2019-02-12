package teoria.clasesParametrizadas;

import java.util.ArrayList;
import java.util.List;

public class ClaseDouble {
	private List<Double> lista = new ArrayList<>();
	
	
	public List<Double> getLista() {
		return lista;
	}

	public void setLista(List<Double> lista) {
		this.lista = lista;
	}

	//añadimos numeros a la lista
	public void addNumero(Double numero) {
		lista.add(numero);
	}
	
	//localizamos un objeto de la lista según posición
	public Double obtenerNumeroPorPosicion(int posicion) {
		
		//para evitar la excepción de índice inexistente
		if (posicion < lista.size())
			return lista.get(posicion);
		else
			return null;
	}

}
