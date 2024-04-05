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

		if (comprobarConsumoEnergetico(consumo.charAt(0))) {
			this.consumo = ConsumoEnergetico.valueOf(consumo);
		}

		if (comprobarColor(color)) {
			this.color = Color.valueOf(color);
		}

	}

	public Electrodomestico(double precio, double peso) {

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

	public char getConsumo() {
		return String.valueOf(consumo).charAt(0);
	}

	public String getColor() {
		return String.valueOf(color);
	}

	private boolean comprobarConsumoEnergetico(char letra) {
		Boolean correcto = false;
		
		switch(letra) {
			case 'A', 'B', 'C', 'D', 'E', 'F' -> {
				this.consumo = ConsumoEnergetico.valueOf(String.valueOf(letra));
				correcto = true;
			}
			default -> {
				this.consumo = ConsumoEnergetico.F;
			}
		}
		
		return correcto;
	}

	private boolean comprobarColor(String color) {
		Boolean correcto = false;
		
		switch(color) {
			case "AZUL", "BLANCO", "GRIS", "NEGRO", "ROJO" -> {
				this.color = Color.valueOf(color);
				correcto = true;
			}
			default -> {
				this.color = Color.BLANCO;
			}
		}
		
		return correcto;
	}
	
	public void precioFinal() {
		
		switch (consumo) {
			
			case A -> {
				this.precioBase += 100;
			}
			
			case B -> {
				this.precioBase += 80;
			}
			
			case C -> {
				this.precioBase += 60;
			}
			
			case D -> {
				this.precioBase += 50;
			}

			case E -> {
				this.precioBase += 30;
			}
			
			case F -> {
				this.precioBase += 10;
			}
		}
		
		if (this.peso >= 0 && this.peso <= 19) {

			this.precioBase += 10;
		
		} else if (this.peso >= 20 && this.peso <= 49) {
		
			this.precioBase += 50;
		
		} else if (this.peso >= 50 && this.peso <= 79) {
		
			this.precioBase += 80;
		
		} else if (this.peso >= 80) {
		
			this.precioBase += 100;
		
		}

	}
	
}
