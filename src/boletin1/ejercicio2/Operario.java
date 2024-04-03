package boletin1.ejercicio2;

public class Operario extends Empleado{

	public Operario(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += " -> Operario";
		
		return cadena;
	}
	
	
}
