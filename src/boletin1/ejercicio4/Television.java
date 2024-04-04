package boletin1.ejercicio4;

public class Television extends Electrodomestico{

	private double resolucion = 50.8;
	
	private boolean sintonizadorTDT = false;
	
	public Television() {
		
	}

	public Television(double precioBase, double peso, String consumo, String color, double resolucion, boolean sintonizador) {
		super(precioBase, peso, consumo, color);
		
		if(resolucion > 0) {
			this.resolucion = resolucion;
		}
		
		this.sintonizadorTDT = sintonizador;
		
	}

	public Television(double precio, double peso) {
		super(precio, peso);

	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if(resolucion > 101.6) {
			
			this.precioBase = ((this.precioBase * 30) / 100);
		
		}
		
		if(this.sintonizadorTDT) {
			
			this.precioBase += 50;
		
		}
		
	}
	
}
