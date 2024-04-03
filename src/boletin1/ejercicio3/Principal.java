package boletin1.ejercicio3;

public class Principal {
	
	public static void main(String[] args) {
		Producto P1 = new Producto("Patatas Fritas", 5.25);
		Perecedero PE1 = new Perecedero("Leche", 2.50, 20);
		NoPerecedero NP1 = new NoPerecedero("Tomate", 1.50, "Vegetal");
		
		PE1.setDiasACaducar(2);
		
		double precioProducto = P1.calcular(20);
		double precioPerecedero = PE1.calcular(10);
		double precioNoPerecedero = NP1.calcular(5);
		
		System.out.println(P1 + "Precio Total: " + precioProducto + "\n");
		System.out.println(PE1 + "Precio Total: " + precioPerecedero + "\n");
		System.out.println(NP1 + "PrecioTotal: " + precioNoPerecedero + "\n");
		
	}
	
}
