package co.unbosque.isii.calculadora_pruebas;

import java.util.HashMap;

public class EncontrarComando {

	public static HashMap<String, Comando> operaciones;
	
	public static Comando cmd(String key) throws ComandoNoEncontradoException {
		// TODO Auto-generated method stub
		if(operaciones.containsKey(key))
			return operaciones.get(key);
		throw new ComandoNoEncontradoException();
	}

	public static void addOp(Comando c) {
		// TODO Auto-generated method stub
		if(operaciones==null)
			operaciones= new HashMap<String, Comando>();
		operaciones.put("+", c);
		operaciones.put("-", c);
		operaciones.put("*", c);
		operaciones.put("/", c);
	}

}