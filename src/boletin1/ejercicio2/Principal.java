package boletin1.ejercicio2;

public class Principal {
	
	public static void main(String[] args) {
		Empleado E1 = new Empleado("Rafa");
		Operario O1 = new Operario("Mario");
		Directivo D1 = new Directivo("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		
		System.out.println(E1);
		System.out.println(O1);
		System.out.println(D1);
		System.out.println(OF1);
		System.out.println(T1);
		
	}

}
