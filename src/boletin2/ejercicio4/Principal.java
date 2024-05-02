package boletin2.ejercicio4;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		int sumaElectrodmesticos = 0;
		int sumaLavadoras = 0;
		int sumaTelevisores = 0;
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[5];
		
		Electrodomestico e1 = new Electrodomestico(150, "blanco", 'A', 2);		
		Television t1 = new Television(700, "NEGRO", 'E', 10, 40, true);
		Television t2 = new Television(900, "GRIS", 'B', 10, 50, true);
		Lavadora l1 = new Lavadora(600, "BLANCO", 'A', 30, 8);
		Lavadora l2 = new Lavadora(800, "GRIS", 'B',40, 5);
		
		electrodomesticos[0] = e1;
		electrodomesticos[1] = t1;
		electrodomesticos[2] = t2;
		electrodomesticos[3] = l1;
		electrodomesticos[4] = l2;
		System.out.println(Arrays.toString(electrodomesticos));
		Arrays.sort(electrodomesticos);
		System.out.println(Arrays.toString(electrodomesticos));
		for(Electrodomestico elect : electrodomesticos) {
			elect.precioFinal();
		}
		
		for(Electrodomestico elect : electrodomesticos) {
			sumaElectrodmesticos += elect.getPrecioBase();
			
			if(elect instanceof Lavadora) {
				sumaLavadoras += elect.getPrecioBase();
			} else if (elect instanceof Television) {
				sumaTelevisores += elect.getPrecioBase();
			} 
		}
		
		System.out.println("Suma de televisores: " + sumaTelevisores);
		System.out.println("Suma de lavadoras: " + sumaLavadoras);
		System.out.println("Suma de electrodomésticos: " + sumaElectrodmesticos);
	}

}
