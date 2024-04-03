package boletin1.ejercicio2;

public class Oficial extends Operario{

	public Oficial(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += " -> Oficial";
		
		return cadena;
	}
	
}
