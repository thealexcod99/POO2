package ejercicios;

public class Rectangulo {
	private double ancho;
	private double alto;
	private static int rectangulosCreados;
	
	public Rectangulo() {
		this.ancho = 1.0;
		this.alto = 1.0;
		rectangulosCreados++;
	}

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
		rectangulosCreados++;
	}
	
	public double getArea() {
		return ancho * alto;
	}
	
	public double getPerimetro() {
		return ancho * 2 + alto * 2;
	}
	
	public static int numeroRectangulosCreados() {
		return rectangulosCreados;
	}
	
//	private static class NumeroRectangulosCreados {
//		public static int rectangulosCreados;
//	}

}
