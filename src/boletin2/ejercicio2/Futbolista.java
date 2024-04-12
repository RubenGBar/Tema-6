package boletin2.ejercicio2;

public class Futbolista {
	
	int numeroCamiseta = 0;
	String nombre = "";
	int edad = 0;
	int numeroGoles = 0;

	public Futbolista(String nombre, int numeroCamiseta, int edad, int numeroGoles) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(numeroCamiseta >= 0) {
			this.numeroCamiseta = numeroCamiseta;
		}
		if(edad > 0) {
			this.edad = edad;
		}
		if(numeroGoles >= 0) {
			this.numeroGoles = numeroGoles;
		}
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "\n" + this.nombre;
		cadena += "Camiseta: " + this.numeroCamiseta + "\n";
		cadena += "Edad: " + this.edad + "\n";
		cadena += "Goles: " + this.numeroGoles + "\n";
		
		return cadena;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean iguales = false;
		o = (Futbolista) o;
		
		
		
		return iguales;
	}
	
}
