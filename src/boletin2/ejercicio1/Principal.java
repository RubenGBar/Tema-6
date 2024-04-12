package boletin2.ejercicio1;

import java.util.Arrays;

public class Principal {
	
	public static void main(String[] args) {
		
		Socio s1 = new Socio(0, "Pepe", 33);
		Socio s2 = new Socio(1, "Pepa", 32);
		Socio s3 = new Socio(2, "Pepo", 31);
		
		Socio arraySocio[] = {s3, s1, s2};
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(Arrays.toString(arraySocio));
		
		Arrays.sort(arraySocio);
		
		System.out.println(Arrays.toString(arraySocio));
		
	}
	
}
