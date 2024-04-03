package boletin1.ejercicio3;

public class Producto {
	
	protected String nombre = "";
	protected double precio = 0;
	
	public Producto(String nombre, double precio) {
		
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(precio > 0) {
			this.precio = precio;
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		String cadena = "";
		
		cadena += this.nombre + "\n";
		cadena += "Precio: " + this.precio + "\n";
		
		return cadena;
	}
	
	public double calcular(int cantidad) {
		double precioTotal = 0;
		
		precioTotal = precio * cantidad;
		
		return precioTotal;
	}
	
}
