package repaso1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Ejercicio 1
		/*String marca;
		double precio;
		
		System.out.println("Introduce la marca: ");
		marca=entrada.nextLine();
		
		System.out.println("Introduce el precio: ");
		precio = entrada.nextDouble();
		
		Funciones.mostrarPrecio(precio, marca);*/

		//Ejercicio 2
		int a�os;
		System.out.println("�Cuantos a�os llevas en la empresa?");
		a�os = entrada.nextInt();
		
		
		System.out.println("el sueldo es "+ Funciones.calcularSueldo(a�os));
		int num;
		
		
		//ejercicio 6
		System.out.println("Introduce el n�mero a multiplicar: ");
		num = entrada.nextInt();
		int vector[] = new int[4];
		System.out.println("introduce el vector:");
		Funciones.pedir_vector(vector);
		System.out.println("Tu vector es ");
		Funciones.mostrar_vector(vector);
		Funciones.multiplicaPorNum(vector, num);
		System.out.println("El resultado es");
		Funciones.mostrar_vector(vector);
		
		
		
		
		
		
		
		
		;
		
	}

}
