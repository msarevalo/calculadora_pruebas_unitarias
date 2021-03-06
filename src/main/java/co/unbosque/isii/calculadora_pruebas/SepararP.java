package co.unbosque.isii.calculadora_pruebas;

import org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper;

public class SepararP {

	public static double separacion(String cadena) throws ComandoNoEncontradoException {
	
		PilasSignos pilaS = new PilasSignos();
		PilasNumeros pilaN = new PilasNumeros();
		MatrizPrioridad mat = new MatrizPrioridad();
		Character digito;
		Character variable = null;
		double temporal = 0;
		int largo = cadena.length();
		int aux = 0;
		int aux2 = 0;
		int contador = 0;
		String cadena2;
		Character digito2;
		double parentesis = 0.0;
		
		for(int i=0; i<largo;i++) {
			digito = cadena.charAt(i);
			if(!digito.equals('+') && !digito.equals('-') && !digito.equals('*') && !digito.equals('/') && !digito.equals('^') && !digito.equals('(') && !digito.equals(')')) {
				temporal = (temporal*10) + Double.parseDouble(""+digito);
				pilaN.getNumeros().push(temporal);
			}else {
				if(digito.equals('(')) {
					cadena2 = "";
					aux = 1;
					aux2 = 0;
					contador = i+1;
					while(aux != aux2) {
						digito2 = cadena.charAt(contador);
						if(!digito2.equals(')')) {
							if(digito2.equals('(')) {
								aux++;
								contador++;
							}else {
								cadena2 = cadena2 + digito2;
								contador++;
							}
						}else {
							aux2++;
							i = contador+1;
						}
					}
					System.out.println(cadena2);
					parentesis = SepararP.separacion(cadena2);
					System.out.println(parentesis);
					pilaN.getNumeros().push(parentesis);
				}
				if(pilaS.getSignos().isEmpty()) {
					pilaS.getSignos().push(digito);
					//System.out.println(digito);
				}else {
					variable = pilaS.getSignos().pop();
					int respuesta = mat.matrizPrincipal(variable, digito);
					//System.out.println(respuesta);
					if(respuesta == 1) {
						//System.out.println("Pasa");
						ActivarComando.activar(variable);
						Comando operacion = EncontrarComando.cmd(variable);
						double numero1 = pilaN.getNumeros().pop();
						double numero2 = pilaN.getNumeros().pop();
						//System.out.println(variable);
						//System.out.println(numero2 + " " + variable + " " + numero1);
						double resultado = operacion.ejecutarOperacion(numero2, numero1);
						System.out.println(resultado);
						pilaN.getNumeros().push(resultado);
						pilaS.getSignos().push(digito);
					}else {
						//System.out.println("No Pasa");
						//System.out.println(digito);
						pilaS.getSignos().push(variable);
						pilaS.getSignos().push(digito);
					}
				}
				//System.out.println(temporal);
				temporal = 0;
			}
			
		}
		//System.out.println(pilaS.getSignos().size());
		//System.out.println(pilaN.getNumeros().size());
		//int rango = pilaN.getNumeros().size();
		//int rangoS = pilaS.getSignos().size();
		/*for(int i = 0; i < rango; i++) {
			System.out.println(pilaN.getNumeros().pop());
		}*/
		/*for(int i=0; i<rangoS;i++) {
			System.out.println(pilaS.getSignos().pop());
		}*/
		//System.out.println(pilaN.getNumeros().size());
		while(pilaS.getSignos().size()>1) {
			char signo1 = pilaS.getSignos().pop();
			char signo2 = pilaS.getSignos().pop();
			int respuesta = mat.matrizPrincipal(signo2, signo1);
			if(respuesta == 1) {
				//System.out.println("Pasa1");
				ActivarComando.activar(signo2);
				Comando operacion = EncontrarComando.cmd(signo2);
				double numero1 = pilaN.getNumeros().pop();
				double numero2 = pilaN.getNumeros().pop();
				double numero3 = pilaN.getNumeros().pop();
				//System.out.println(signo2);
				//System.out.println(numero3 + " " + signo2 + " " + numero2);
				double resultado = operacion.ejecutarOperacion(numero3, numero2);
				System.out.println(resultado);
				pilaN.getNumeros().push(resultado);
				pilaN.getNumeros().push(numero1);
				pilaS.getSignos().push(signo1);
			}else {
				//System.out.println("Pasa2");
				ActivarComando.activar(signo1);
				Comando operacion = EncontrarComando.cmd(signo1);
				double numero1 = pilaN.getNumeros().pop();
				double numero2 = pilaN.getNumeros().pop();
				double numero3 = pilaN.getNumeros().pop();
				//System.out.println(signo1);
				//System.out.println(numero2 + " " +  signo1 + " " + numero1);
				double resultado = operacion.ejecutarOperacion(numero2, numero1);
				//System.out.println(resultado);
				pilaN.getNumeros().push(numero3);
				pilaN.getNumeros().push(resultado);
				pilaS.getSignos().push(signo2);
			}
		}
		
		char ultimo = pilaS.getSignos().pop();
		ActivarComando.activar(ultimo);
		Comando operacion = EncontrarComando.cmd(ultimo);
		double numero1 = pilaN.getNumeros().pop();
		double numero2 = pilaN.getNumeros().pop();
		//double numero3 = pilaN.getNumeros().pop();
		System.out.println(ultimo);
		//System.out.println(numero2 + " " + ultimo + " " + numero1);
		double resultado = operacion.ejecutarOperacion(numero2, numero1);
		//System.out.println(resultado);
		//pilaN.getNumeros().push(resultado);
		
		return resultado;
		
		/*int rango = pilaN.getNumeros().size();
		int rangoS = pilaS.getSignos().size();
		for(int i = 0; i < rango; i++) {
			System.out.println(pilaN.getNumeros().pop());
		}
		for(int i=0; i<rangoS;i++) {
			System.out.println(pilaS.getSignos().pop());
		}*/
	}
	
	/*public static void main(String[] args) throws ComandoNoEncontradoException {
		separacion("5*3+2");
	}*/
}
