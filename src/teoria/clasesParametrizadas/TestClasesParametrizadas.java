package teoria.clasesParametrizadas;

public class TestClasesParametrizadas {

	public static void main(String[] args) {
		ClaseCadenas cCadenas = new ClaseCadenas();
		cCadenas.addCadena("hola");
		cCadenas.addCadena("pepe");
		cCadenas.addCadena("fin");
		System.out.println(cCadenas.obtenerCadenaPorPosicion(0));
		System.out.println(cCadenas.obtenerCadenaPorPosicion(10));
		
		ClaseDouble cDouble = new ClaseDouble();
		cDouble.addNumero(12.2);
		cDouble.addNumero((double) 10);
		cDouble.addNumero(2.2);
		System.out.println(cDouble.obtenerNumeroPorPosicion(0));
		System.out.println(cDouble.obtenerNumeroPorPosicion(10));
		System.out.println(cDouble.getLista());
		
		ClaseParametrizada<Integer> cParametrizada = new ClaseParametrizada<>();
		cParametrizada.addItem(3);
		cParametrizada.addItem(5);
		cParametrizada.addItem(-96);
		System.out.println(cParametrizada.obtenerItemPorPosicion(0));
		System.out.println(cParametrizada.obtenerItemPorPosicion(10));
		System.out.println(cParametrizada.getLista());
		
		ClaseParametrizada<Short> cParametrizada2 = new ClaseParametrizada<>();
		cParametrizada2.addItem((short) 3);
		cParametrizada2.addItem((short) 5);
		cParametrizada2.addItem((short) -96);
		System.out.println(cParametrizada2.obtenerItemPorPosicion(0));
		System.out.println(cParametrizada2.obtenerItemPorPosicion(10));
		System.out.println(cParametrizada2.getLista());

	}

}
