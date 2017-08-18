package co.unbosque.isii.calculadora_pruebas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System .in);
		String cadena = null;
		
		System.out.println("Escriba la operacion");
		teclado.nextLine();
		
		SepararNumeros.separacionNumeros(cadena);
		SepararSignos.separacionSignos(cadena);
		
		
		
	}

}
