package co.unbosque.isii.calculadora_pruebas;

import java.util.ArrayList;
import java.util.HashMap;

public class MatrizPrioridad {


	public static int matriz() {

		HashMap<Character, ArrayList<Integer>> columnas = new HashMap<Character, ArrayList<Integer>>();
		
		ArrayList<Integer> suma = new ArrayList<Integer>();
		ArrayList<Integer> resta = new ArrayList<Integer>();
		ArrayList<Integer> division = new ArrayList<Integer>();
		ArrayList<Integer> multiplicacion = new ArrayList<Integer>();
		
		suma.add(1); suma.add(1); suma.add(0); suma.add(0);
		resta.add(0); resta.add(1); resta.add(0); resta.add(0);
		division.add(1); division.add(1); division.add(0); division.add(1);
		multiplicacion.add(1); multiplicacion.add(1); multiplicacion.add(1); multiplicacion.add(1);
		
		columnas.put('+', suma);
		columnas.put('-', resta);
		columnas.put('/', division);
		columnas.put('*', multiplicacion);
		return 0;
	}
	
}
