package teoria.clasesinternas.clasesanonimas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploClaseAnonima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{12,25,22,1,2,2,55}
		int[] arrayEnteros = {12,25,22,1,2,2,55};
		List<Integer> listaEnteros = Arrays.asList(12,25,22,1,2,2,55);
		System.out.println(listaEnteros);
		Collections.sort(listaEnteros);
		System.out.println(listaEnteros);
		
		//La clase de abajo pertenece a la interfaz de Comparator, es interna porque esta dentro de otra clase 
		//y es anónima porque no se le ha dado ningun nombre.
		//Se ha usado para ordenar la lista
		Collections.sort(listaEnteros,
				new Comparator<Integer> () {

					@Override
					public int compare(Integer arg0, Integer arg1) {
						// TODO Auto-generated method stub
						return arg0 - arg1;
					}

				});

	}

}
