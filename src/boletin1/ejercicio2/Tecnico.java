package boletin1.ejercicio2;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += " -> Técnico";
		
		return cadena;
	}
	
}
