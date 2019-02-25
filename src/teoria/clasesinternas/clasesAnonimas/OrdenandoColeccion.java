package teoria.clasesinternas.clasesAnonimas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoColeccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float> listaNumeros = new ArrayList<>();
		listaNumeros.add(2.2f);
		for (int i = 0; i < 10; i++) {
			listaNumeros.add((float) (Math.random() * 100));
		}
		System.out.println("lista sin ordenar");
		System.out.println(listaNumeros);
		Collections.sort(listaNumeros);
		System.out.println("lista ordenada");
		System.out.println(listaNumeros);
		
		//Creamos un objeto de la clase del comparador
		Comparador comparador = new Comparador();
		Collections.sort(listaNumeros, comparador);
		System.out.println("lista ordenada de mayor a menor");
		System.out.println(listaNumeros);
	}

}
