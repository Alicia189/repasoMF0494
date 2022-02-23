package repaso1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String marca;
		double precio;
		
		System.out.println("Introduce la marca: ");
		marca=entrada.nextLine();
		
		System.out.println("Introduce el precio: ");
		precio = entrada.nextDouble();
		
		Funciones.mostrarPrecio(precio, marca);

	}

}
