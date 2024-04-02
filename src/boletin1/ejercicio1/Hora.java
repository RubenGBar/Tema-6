package boletin1.ejercicio1;

public class Hora {

	protected int hora = 0;
	protected int minuto = 0;

	public Hora(int hora, int minuto) {
		super();
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}

	public void inc() {
		if (minuto == 59) {
			this.minuto = 0;

			if (hora == 23) {
				this.hora = 0;
			}

		} else {
			this.minuto++;
		}

	}

	public boolean setMinutos(int minutos) {
		boolean valido = false;

		if (minutos >= 0 && minutos < 60) {
			this.minuto = minutos;
			valido = true;
		}

		return valido;
	}

	public boolean setHora(int hora) {
		boolean valido = false;

		if (hora >= 0 && hora < 23) {
			this.hora = hora;
			valido = true;
		}

		return valido;
	}

	@Override
	public String toString() {
		String cadena = "";

		if (hora < 10) {
			cadena += 0;
		}
		
		cadena += this.hora + ":";
		
		if (minuto < 10) {
			cadena += 0;
		}
		
		cadena += this.minuto;

		return cadena;
	}

}
