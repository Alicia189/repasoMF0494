package repaso1;

public class Funciones {

	public static void mostrarPrecio(double precio, String marca) {
		double descuento;
		double precioFinal;
		
		if (marca.equals("Honda")) {
			descuento = precio * 0.05;
		} else if (marca.equals("Yamaha")){
			descuento = precio * 0.08;
		} else if (marca.equals("Suzuki")) {
			descuento = precio*0.1; 
		} else {
			descuento=precio*0.02;
		}
		precioFinal = precio-descuento;
		
		System.out.printf("La moto %s vale %.2f con "
				+ "un descuento de %.2f"
				+ "y precio final de %.2f", 
				marca, precio, descuento, precioFinal);

	}
	
}
