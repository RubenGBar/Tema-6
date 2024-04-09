package boletin1.ejercicio5;

public abstract class Poligono {

	protected int numeroLados;
	
	public Poligono(int numeroLados) {
		super();
		if(numeroLados > 2) {
			this.numeroLados = numeroLados;
		}
	}
	
	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "Número de Lados: " + this.numeroLados;
		
		return cadena;
	}

	
	public abstract double area();
	
}
