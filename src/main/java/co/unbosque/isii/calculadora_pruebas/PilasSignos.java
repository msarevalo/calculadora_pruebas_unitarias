package co.unbosque.isii.calculadora_pruebas;

import java.util.Stack;

public class PilasSignos {
	
	public static void pilas(String cadena) {
		Stack<Character> signos = new Stack<Character>();
		
		signos.push(new Character('^'));
		signos.push(new Character('+'));
		signos.push(new Character('*'));
		while(!signos.isEmpty()) {
		System.out.println(signos.pop());}
	}
}
