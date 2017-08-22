package co.unbosque.isii.calculadora_pruebas;

import java.util.HashMap;

public class Llaves {

	public static HashMap<Character, Character> llave(){
		
		HashMap<Character, Character> key = new HashMap<Character, Character>();
		key.put('+', '+');
		key.put('+', '-');
		key.put('+', '*');
		key.put('+', '/');
		
		key.put('-', '+');
		
		return key;
	}
}
