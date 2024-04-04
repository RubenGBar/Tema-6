package boletin1.ejercicio4;

public class Lavadora extends Electrodomestico{
	
	private double carga = 5;
	
	public Lavadora() {
		
	}
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		
	}

	public Lavadora(double precioBase, double peso, String consumo, String color, double carga) {
		super(precioBase, peso, consumo, color);
		
		if(carga > 0) {
			this.carga = carga;
		}
		
	}

	public double getCarga() {
		return carga;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if(this.carga > 30) {
			this.precioBase += 50;
		}
		
	}
	
}
