package boletin2.ejercicio4;


public class Lavadora extends Electrodomestico {

	private int carga = 5;

	public Lavadora() {
		super();
	}

	public Lavadora(double precio, float peso) {
		super(precio, peso);

	}

	public Lavadora(double precio, String color, char consumo, float peso, int carga) {
		super(precio, color, consumo, peso);
		
		if (carga > 0) {
			this.carga = carga;
		}
	}
	
	public int getCarga() {
		return carga;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if(carga>=30) {
			super.precioBase += 50;
		}
	}
}