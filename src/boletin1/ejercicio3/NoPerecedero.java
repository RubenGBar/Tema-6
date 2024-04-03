package boletin1.ejercicio3;

public class NoPerecedero extends Producto{
	
	String tipo = "";
	
	public NoPerecedero (String nombre, double precio, String tipo) {
		super(nombre, precio);
		
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += "Tipo: " + this.tipo + "\n";
		
		return cadena;
	}
	
}
