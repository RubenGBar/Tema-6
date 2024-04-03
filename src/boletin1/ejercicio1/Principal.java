package boletin1.ejercicio1;

public class Principal {
	
	public static void main(String[] args) {
		HoraExacta HE1 = new HoraExacta(3, 1, 8);
		
		HE1.setHora(23);
		HE1.setMinutos(59);
		HE1.setSegundo(59);
		
		HE1.inc();
		
		System.out.println(HE1);
		
	}

}
