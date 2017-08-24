package co.unbosque.isii.calculadora_pruebas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ComandoNoEncontradoException {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String cadena = null;
		int respuesta = 0;

		System.out.println("Escriba EXIT para salir");
		while (respuesta == 0) {
			try {
				System.out.println("Escriba la operacion a realizar");
				cadena = teclado.nextLine();

				if (cadena.equals("exit") || cadena.equals("Exit") || cadena.equals("EXIT")) {
					System.out.println("Gracias por usar la Calculadora!!");
					respuesta = 1;
				} else {
					if (!cadena.isEmpty()) {
						System.out.printf("El resultado de %s es %.2f\n\n", cadena, SepararP.separacion(cadena));
					}else {
						
					}
				}
			} catch (Exception e) {
				System.out.println("Oh Oh algo ha sucedido, intenta de nuevo\n");
			}
		}

		teclado.close();

	}

}
