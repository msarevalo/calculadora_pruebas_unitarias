package co.unbosque.isii.calculadora_pruebas;

public class Resta implements Comando {

	public static double resta(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		return resultado;
	}

	public double ejecutarOperacion(double a, int b) {
		// TODO Auto-generated method stub
		return this.resta(a, b);
	}

	public String separar(String cadena) {
		// TODO Auto-generated method stub
		return null;
	}

}