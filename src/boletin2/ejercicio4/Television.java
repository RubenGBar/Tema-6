package boletin2.ejercicio4;

public class Television extends Electrodomestico {

	private int resolucion = 20;
	private boolean sintonizadorTDT = false;
	
	public Television() {
		super();
	}
	
	public Television(double precio, float peso){
		super(precio, peso);
	}
	
	public Television(double precio, String color, char consumo, float peso, int resolucion, boolean sintonizador) {
		super(precio, color, consumo, peso);
		
		if(resolucion > 0) {
			this.resolucion = resolucion;
		}
		
		this.sintonizadorTDT = sintonizador;
	}
	
	public int getResolucion() {
		return resolucion;
	}
	
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if(resolucion>=40) {
			precioBase += precioBase*0.3;
		}
		
		if(sintonizadorTDT) {
			precioBase += 50;
		}
	}
}
