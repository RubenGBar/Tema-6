package boletin1.ejercicio5;

public class Rectangulo extends Poligono{

	private double lado1;
	private double lado2;
	
	public Rectangulo() {
		super(4);
	}
	
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		
		if(lado1 > 0) {
			this.lado1 = lado1;
		}
		
		if(lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "Tipo de Pol�gono: Rect�ngulo \n";
		cadena += "Lado 1: " + this.lado1 + "\n";
		cadena += "Lado 2: " + this.lado2 + "\n";
		cadena += "Lado 3: " + this.lado1 + "\n";
		cadena += "Lado 4: " + this.lado2;

		return cadena;
	}
	
	@Override
	public double area() {
		return this.lado1 * this.lado2;
	}
	
}
