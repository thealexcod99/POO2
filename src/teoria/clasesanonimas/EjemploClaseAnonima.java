package teoria.clasesanonimas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EjemploClaseAnonima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{12,25,22,1,2,2,55}
		int[] arrayEnteros = {12,25,22,1,2,2,55};
		List<Integer> listaEnteros = Arrays.asList(12,25,22,1,2,2,55);
		System.out.println(listaEnteros);
		Collections.sort(listaEnteros);
		

	}

}
