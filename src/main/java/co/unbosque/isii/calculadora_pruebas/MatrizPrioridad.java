package co.unbosque.isii.calculadora_pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
//import java.util.Map;

import javax.swing.RowFilter.Entry;

import org.testng.internal.collections.Pair;

public class MatrizPrioridad {
	
	public static int matriz() {
		/*ArrayList<Contenido> matriz = new ArrayList<Contenido>();
		Contenido cont;*/
		
		//HashMap<Entry<Character, Character>, Integer> matriz = new HashMap<Entry<Character,Character>, Integer>();
	 
		
		/*Pair<Character, Character> suma_resta = new Pair<Character, Character>('+', '-');
		Pair
		
		matriz.put(suma, 1);
		matriz.put(suma_resta, 0);*/
		//matriz.add(cont);
		
		//Map<new Map<Character, Character>, Integer> matriz = new Map<new Map<Character, Character>, Integer>;
		HashMap<HashMap<Character, Character>, Integer> matriz = new HashMap<HashMap<Character,Character>, Integer>();;
		
		matriz.put(new HashMap<Character, Character>(){{put('+','+');}}, 1);
		//prueba
		
		return matriz.get('+');
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
}
