package co.unbosque.isii.calculadora_pruebas;

public class Divide implements Comando {

	public static double divide(double numero1, double numero2) {
		double resultado;
		if(numero1 >= numero2) {
			resultado = numero1 / numero2;
		}else {
			resultado = numero2 / numero1;
		}
		return resultado;
	}

	public double ejecutarOperacion(double a, int b) {
		// TODO Auto-generated method stub
		return this.divide(a, b);
	}

	public String separar(String cadena) {
		// TODO Auto-generated method stub
		return null;
	}

}
