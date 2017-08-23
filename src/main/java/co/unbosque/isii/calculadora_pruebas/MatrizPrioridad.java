package co.unbosque.isii.calculadora_pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
//import java.util.Map;

import org.testng.internal.collections.Pair;

public class MatrizPrioridad {
	
	public static int matriz() {
		/*ArrayList<Contenido> matriz = new ArrayList<Contenido>();
		Contenido cont;*/
		
		HashMap<Pair<Character, Character>, Integer> matriz = new HashMap<Pair<Character,Character>, Integer>();
		Pair<Character, Character> suma = new Pair<Character, Character>('+', '+');
		Pair<Character, Character> suma_resta = new Pair<Character, Character>('+', '-');
		
		matriz.put(suma, 1);
		matriz.put(suma_resta, 0);
		//matriz.add(cont);
		
		
		//prueba
		
		return 0;
	}
	
}
