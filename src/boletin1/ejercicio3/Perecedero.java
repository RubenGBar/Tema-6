package boletin1.ejercicio3;

public class Perecedero extends Producto{

	int diasACaducar = 0;
	
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		
		if(diasACaducar > 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += "Días para que caduque: " + this.diasACaducar + "\n";
		
		return cadena;
	}
	
	@Override
	public double calcular(int cantidad) {
		double precioTotal = super.calcular(cantidad);
		
		if (this.diasACaducar == 1) {
			
			precioTotal /= 4;
			
		} else if (this.diasACaducar == 2) {
			
			precioTotal /= 3;
			
		} else if (this.diasACaducar == 3) {
			
			precioTotal /= 2;
			
		}
		
		return precioTotal;
	}
	
}
