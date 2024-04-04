package boletin1.ejercicio4;

public class Electrodomestico {

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	protected double precioBase = 100;

	protected double peso = 5;
	
	protected ConsumoEnergetico consumo = ConsumoEnergetico.F;
	
	protected Color color = Color.BLANCO;

	public Electrodomestico() {
		
	}
	
	public Electrodomestico(double precioBase, double peso, String consumo, String color) {
		
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		
		if (peso > 0) {
			this.peso = peso;
		}
		
		if (consumo != null && !consumo.equals("")) {
			this.consumo = ConsumoEnergetico.valueOf(consumo);
		}
		
		if (color != null && !color.equals("")) {
			this.color = Color.valueOf(color);
		}
		
	}

	public Electrodomestico (double precio, double peso) {
		
		if (precio > 0) {
			this.precioBase = precio;
		}
		
		if (peso > 0) {
			this.peso = peso;
		}
		
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public ConsumoEnergetico getConsumo() {
		return consumo;
	}

	public Color getColor() {
		return color;
	}
	
	
	
}
