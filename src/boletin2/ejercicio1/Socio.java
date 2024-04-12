package boletin2.ejercicio1;

public class Socio implements Comparable<Socio> {
	
	int id = 0;
	String nombre = "";
	int edad = 0;
	
	public Socio(int id, String nombre, int edad) {
		if(id >= 0) {
			this.id = id;
		}
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(edad > 0) {
			this.edad = edad;
		}
	}

	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "\n" + this.nombre + "\n";
		cadena += "Edad: " + this.edad + "\n";
		cadena += "ID: " + this.id + "\n";
		
		return cadena;
	}

	@Override
	public int compareTo(Socio s) {
		int comparacion = 0;
		
		if(this.id > s.id) {
			comparacion = 1;
		}else if(this.id < s.id) {
			comparacion = -1;
		}
		
		return comparacion;
	}
	
}
