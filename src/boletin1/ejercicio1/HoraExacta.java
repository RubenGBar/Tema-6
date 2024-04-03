package boletin1.ejercicio1;

public class HoraExacta extends Hora{
	
	private int segundo = 0;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		}
		
	}
	
	public boolean setSegundo (int segundo) {
		boolean valido = false;
		
		if (segundo >= 0 && segundo < 60) {
			valido = true;
		}
		
		return valido;
	}
	
	@Override
	public void inc () {
		
		if (segundo == 59) {
			this.segundo = 0;
			
			super.inc();
			
		} else {
			this.segundo++;
		}
		
	}
	
	@Override
	public String toString () {
		String cadena = "";
		
		super.toString();
		
		cadena += ":";
		
		if (segundo < 10) {
			cadena += 0;
		}
		
		cadena += this.segundo;
		
		return cadena;
	}
}
