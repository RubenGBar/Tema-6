package boletin2.ejercicio4;

public class Electrodomestico implements Comparable<Electrodomestico>{

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	};

	enum Colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	protected double precioBase = 100;
	private Colores color = Colores.BLANCO;
	private ConsumoEnergetico consumo = ConsumoEnergetico.F;
	private float peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(double precio, float peso) {
		if (precio > 0) {
			this.precioBase = precio;
		}

		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precio, String color, char consumo, float peso) {
		this(precio, peso);

		comprobarConsumoEnergetico(consumo);
		comprobarColor(color);

	}

	public double getPrecioBase() {
		return this.precioBase;
	}

	public String getColor() {
		return String.valueOf(this.color);
	}

	public char getConsumo() {
		return String.valueOf(this.consumo).charAt(0); // E --> "E" --> 'E'
	}

	public float getPeso() {
		return this.peso;
	}

	private void comprobarConsumoEnergetico2(char letra) {
		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E', 'F':
			this.consumo = ConsumoEnergetico.valueOf(String.valueOf(letra));
			break;
		default:
			this.consumo = ConsumoEnergetico.F;
			break;
		}

	}

	private void comprobarConsumoEnergetico(char letra) {
		String letraCad = String.valueOf(letra);
		
		try {
			this.consumo = ConsumoEnergetico.valueOf(letraCad);
		} catch (IllegalArgumentException e) {
			this.consumo = ConsumoEnergetico.F;
		}
		
	}

	private void comprobarColor(String color) {
		String colorMayus = color.toUpperCase();

		switch (colorMayus) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS":
			this.color = Colores.valueOf(colorMayus);
			break;
		default:
			this.color = Colores.BLANCO;
			break;
		}
	}

	public void precioFinal() {
		precioBase = switch (consumo) {
		case A -> precioBase + 100;
		case B -> precioBase + 80;
		case C -> precioBase + 60;
		case D -> precioBase + 50;
		case E -> precioBase + 30;
		case F -> precioBase + 10;
		};

		if (peso >= 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else {
			precioBase += 100;
		}

	}

	@Override
	public int compareTo(Electrodomestico o) {
		int res = 0;
		
		if(this.precioBase < o.precioBase) {
			res = -1;
		} else if (this.precioBase > o.precioBase) {
			res = 1;
		}
		
		return res;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
	
}