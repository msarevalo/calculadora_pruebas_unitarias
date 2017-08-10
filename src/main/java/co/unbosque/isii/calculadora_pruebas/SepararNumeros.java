package co.unbosque.isii.calculadora_pruebas;

import java.util.ArrayList;

public class SepararNumeros {

	public static ArrayList<Double> separacionNumeros(String cadena) {
		// TODO Auto-generated method stub
		String[] numeros;
		numeros = cadena.split("[-*/+]");
		ArrayList<Double> numeros2 = new ArrayList<Double>();
		
		for(int i =0; i<numeros.length;i++) {
			numeros2.add(Double.parseDouble(numeros[i]));
		}
		return numeros2;
	}
}
