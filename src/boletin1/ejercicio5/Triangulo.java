package boletin1.ejercicio5;

public class Triangulo extends Poligono{

	private double lado1 = 0;
	private double lado2 = 0;
	private double lado3 = 0;
	
	public Triangulo() {
		super(3);
		
	}

	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		
		if(lado1 > 0) {
			this.lado1 = lado1;

		}
		if(lado2 > 0) {
			this.lado2 = lado2;

		}
		if(lado3 > 0) {
			this.lado3 = lado3;

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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "Tipo de Polígono: Triángulo \n";
		cadena += "Lado 1: " + this.lado1 + "\n";
		cadena += "Lado 2: " + this.lado2 + "\n";
		cadena += "Lado 3: " + this.lado3 + "\n";
		
		return cadena;
	}
	
	@Override
	public double area() {
		return (this.lado1 + this.lado2 + this.lado3) / 2;
	}
	
}
