package co.unbosque.isii.calculadora_pruebas;

import java.util.Scanner;

public class Separar {

	static PilasSignos pilaS = new PilasSignos();
	static PilasNumeros pilaN = new PilasNumeros();
	static MatrizPrioridad mat = new MatrizPrioridad();
	
	public static void main(String[] args) throws ComandoNoEncontradoException {
		Scanner teclado = new Scanner(System .in);
		String cadena;
		
		//System.out.println("Escriba una cadena cualquiera: ");
		//cadena = teclado.nextLine();
		
		//System.out.println(MatrizPrioridad.matrizPrincipal('+', '+'));
		separacion("10+560*10");
	}

	public static void separacion(String cadena) throws ComandoNoEncontradoException {
		Character digito;
		//pilaN.getNumeros().push(0);
		double temporal = 0;
		double temporal2 = 0;
		EncontrarComando.addOp(new Suma());
		EncontrarComando.addOp(new Resta());
		EncontrarComando.addOp(new Multiplica());
		EncontrarComando.addOp(new Divide());
		
		for(int i=0; i<cadena.length();i++) {
			digito = cadena.charAt(i);
			if(!digito.equals('+') && !digito.equals('-') && !digito.equals('*') && !digito.equals('/')){
				//temporal = pilaN.getNumeros().pop();
				temporal = (temporal * 10) + Double.parseDouble(""+digito);
				//pilaN.getNumeros().push(temporal);
				//System.out.println(temporal);
				temporal2 = temporal;
			}else {
				pilaN.getNumeros().push(temporal);
				System.out.println(digito);
				if(pilaS.getSignos().isEmpty()) {
					pilaS.getSignos().push(digito);
				}else {
					//System.out.println("Prueba");
					char signo = pilaS.getSignos().pop();
					int resultado = mat.matrizPrincipal(signo, digito);
					if(resultado == 1) {
						System.out.println("Prueba");
						Comando operacion = EncontrarComando.cmd(digito);
						double respuesta = operacion.ejecutarOperacion(pilaN.getNumeros().pop(), temporal2);
						pilaN.getNumeros().push(respuesta);
					}
				}
				temporal = 0;
				temporal2=0;
			}
			//pilaN.getNumeros().push(temporal);
		}
		//pilaN.getNumeros().push(temporal);
		
		if(!pilaS.getSignos().isEmpty()) {
			char sig = pilaS.getSignos().pop();
			EncontrarComando.addOp(new Multiplica());
			Comando operacion = EncontrarComando.cmd(sig);
			double respuesta = operacion.ejecutarOperacion(pilaN.getNumeros().pop(), temporal);
			pilaN.getNumeros().push(respuesta);
		}
		
		for(int i=0;i<pilaN.getNumeros().size();i++) {
			System.out.println(pilaN.getNumeros().get(i));
		}
		
		for(int i=0;i<pilaS.getSignos().size();i++) {
			System.out.println(pilaS.getSignos().get(i));
		}
	}
}
